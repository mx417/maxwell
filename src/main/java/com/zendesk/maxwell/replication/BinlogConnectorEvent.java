package com.zendesk.maxwell.replication;

import com.github.shyiko.mysql.binlog.event.*;
import com.zendesk.maxwell.producer.MaxwellOutputConfig;
import com.zendesk.maxwell.row.RowMap;
import com.zendesk.maxwell.schema.Table;
import com.zendesk.maxwell.schema.columndef.ColumnDef;

import static com.zendesk.maxwell.util.EncodeCacheTaskManager.encodeColsMap;
import com.zendesk.maxwell.util.Md5Encode;
import com.zendesk.maxwell.util.PhoneEncode;

import java.io.Serializable;
import java.util.*;

public class BinlogConnectorEvent {
	public static final String BEGIN = "BEGIN";
	public static final String COMMIT = "COMMIT";
	public static final String SAVEPOINT = "SAVEPOINT";
	private final MaxwellOutputConfig outputConfig;
	private BinlogPosition position;
	private BinlogPosition nextPosition;
	private final Event event;
	private long markTimeMill;
	private final String gtidSetStr;
	private final String gtid;

	public BinlogConnectorEvent(Event event, String filename, String gtidSetStr, String gtid, MaxwellOutputConfig outputConfig, long markTimeMill) {
		this.event = event;
		this.gtidSetStr = gtidSetStr;
		this.gtid = gtid;
		EventHeaderV4 hV4 = (EventHeaderV4) event.getHeader();
		this.nextPosition = new BinlogPosition(gtidSetStr, gtid, hV4.getNextPosition(), filename);
		this.position = new BinlogPosition(gtidSetStr, gtid, hV4.getPosition(), filename);
		this.outputConfig = outputConfig;

		//纳秒时间戳
		this.markTimeMill = markTimeMill;
	}

	public Event getEvent() {
		return event;
	}

	public WriteRowsEventData writeRowsData() {
		return (WriteRowsEventData) event.getData();
	}

	public UpdateRowsEventData updateRowsData() {
		return (UpdateRowsEventData) event.getData();
	}

	public DeleteRowsEventData deleteRowsData() {
		return (DeleteRowsEventData) event.getData();
	}

	public QueryEventData queryData() {
		return (QueryEventData) event.getData();
	}

	public XidEventData xidData() {
		return (XidEventData) event.getData();
	}

	public TableMapEventData tableMapData() {
		return (TableMapEventData) event.getData();
	}

	public BinlogPosition getPosition() {
		return position;
	}

	public BinlogPosition getNextPosition() {
		return nextPosition;
	}

	public EventType getType() {
		return event.getHeader().getEventType();
	}

	public Long getTableID() {
		EventData data = event.getData();
		switch ( event.getHeader().getEventType() ) {
			case EXT_WRITE_ROWS:
			case WRITE_ROWS:
				return ((WriteRowsEventData) data).getTableId();
			case EXT_UPDATE_ROWS:
			case UPDATE_ROWS:
				return ((UpdateRowsEventData) data).getTableId();
			case EXT_DELETE_ROWS:
			case DELETE_ROWS:
				return ((DeleteRowsEventData) data).getTableId();
			case TABLE_MAP:
				return ((TableMapEventData) data).getTableId();
		}
		return null;
	}

	public boolean isCommitEvent() {
		EventType eventType = getType();
		if (eventType == EventType.XID) {
			return true;
		} else if (eventType == EventType.QUERY) {
			// MyISAM will output a "COMMIT" QUERY_EVENT instead of a XID_EVENT.
			// There's no transaction ID but we can still set "commit: true"
			return COMMIT.equals(queryData().getSql());
		}

		return false;
	}

	private void writeData(Table table, RowMap row, Serializable[] data, BitSet includedColumns) {
		int dataIdx = 0, colIdx = 0;

		//加密
		String key = (table.getDatabase() + "." + table.getName()).toLowerCase();
		if (encodeColsMap.containsKey(key)){
			Map<String, Integer> mp = encodeColsMap.get(key);
			for (ColumnDef cd : table.getColumnList() ) {
				if ( includedColumns.get(colIdx) ) {
					Object json = null;
					if ( data[dataIdx] != null ) {
						json = cd.asJSON(data[dataIdx], outputConfig);
						if ((cd.getName() != null) && mp.containsKey(cd.getName().toLowerCase())){
							String d = json.toString();
							switch (mp.get(cd.getName().toLowerCase())){
								case 1:
									json = PhoneEncode.encryption(d, "SHA-256", d);
									break;
								case 2:
									json = Md5Encode.encryption(d, "SHA", d);
									break;
							}
						}
					}
					row.putData(cd.getName(), json);
					dataIdx++;
				}
				colIdx++;
			}
		} else {
			for ( ColumnDef cd : table.getColumnList() ) {
				if ( includedColumns.get(colIdx) ) {
					Object json = null;
					if ( data[dataIdx] != null ) {
						json = cd.asJSON(data[dataIdx], outputConfig);
					}
					row.putData(cd.getName(), json);
					dataIdx++;
				}
				colIdx++;
			}
		}
	}

	private void writeOldData(Table table, RowMap row, Serializable[] oldData, BitSet oldIncludedColumns) {
		int dataIdx = 0, colIdx = 0;

		//加密
		String key = (table.getDatabase() + "." + table.getName()).toLowerCase();
		if (encodeColsMap.containsKey(key)){
			Map<String, Integer> mp = encodeColsMap.get(key);
			for ( ColumnDef cd : table.getColumnList() ) {
				if ( oldIncludedColumns.get(colIdx) ) {
					Object json = null;
					if ( oldData[dataIdx] != null ) {
						json = cd.asJSON(oldData[dataIdx], outputConfig);
						if ((cd.getName() != null) && mp.containsKey(cd.getName().toLowerCase())){
							String d = json.toString();
							switch (mp.get(cd.getName().toLowerCase())){
								case 1:
									json = PhoneEncode.encryption(d, "SHA-256", d);
									break;
								case 2:
									json = Md5Encode.encryption(d, "SHA", d);
									break;
							}
						}
					}

					if (!row.hasData(cd.getName())) {
					/*
					   If we find a column in the BEFORE image that's *not* present in the AFTER image,
					   we're running in binlog_row_image = MINIMAL.  In this case, the BEFORE image acts
					   as a sort of WHERE clause to update rows with the new values (present in the AFTER image),
					   In this case we should put what's in the "before" image into the "data" section, not the "old".
					 */
						row.putData(cd.getName(), json);
					} else {
						if (!Objects.equals(row.getData(cd.getName()), json)) {
							row.putOldData(cd.getName(), json);
						}
					}
					dataIdx++;
				}
				colIdx++;
			}
		}


		for ( ColumnDef cd : table.getColumnList() ) {
			if ( oldIncludedColumns.get(colIdx) ) {
				Object json = null;
				if ( oldData[dataIdx] != null ) {
					json = cd.asJSON(oldData[dataIdx], outputConfig);
				}

				if (!row.hasData(cd.getName())) {
					/*
					   If we find a column in the BEFORE image that's *not* present in the AFTER image,
					   we're running in binlog_row_image = MINIMAL.  In this case, the BEFORE image acts
					   as a sort of WHERE clause to update rows with the new values (present in the AFTER image),
					   In this case we should put what's in the "before" image into the "data" section, not the "old".
					 */
					row.putData(cd.getName(), json);
				} else {
					if (!Objects.equals(row.getData(cd.getName()), json)) {
						row.putOldData(cd.getName(), json);
					}
				}
				dataIdx++;
			}
			colIdx++;
		}
	}

	private RowMap buildRowMap(String type, Position position, Position nextPosition, Serializable[] data, Table table, BitSet includedColumns, String rowQuery, Long markTimeNanoseconds) {
		RowMap map = new RowMap(
			type,
			table.getDatabase(),
			table.getName(),
			event.getHeader().getTimestamp(),
			table.getPKList(),
			position,
			nextPosition,
			rowQuery,
			markTimeNanoseconds
		);

		writeData(table, map, data, includedColumns);
		return map;
	}

	public List<RowMap> jsonMaps(Table table, long lastHeartbeatRead, String rowQuery) {
		ArrayList<RowMap> list = new ArrayList<>();

		//纳秒
		long nanoseconds = this.markTimeMill * 10000;

		Position position     = Position.valueOf(this.position, lastHeartbeatRead);
		Position nextPosition = Position.valueOf(this.nextPosition, lastHeartbeatRead);

		switch ( getType() ) {
			case WRITE_ROWS:
			case EXT_WRITE_ROWS:
				for ( Serializable[] data : writeRowsData().getRows() ) {
					list.add(buildRowMap("insert", position, nextPosition, data, table, writeRowsData().getIncludedColumns(), rowQuery, nanoseconds));
					nanoseconds += 1;
				}
				break;
			case DELETE_ROWS:
			case EXT_DELETE_ROWS:
				for ( Serializable[] data : deleteRowsData().getRows() ) {
					list.add(buildRowMap("delete", position, nextPosition, data, table, deleteRowsData().getIncludedColumns(), rowQuery, nanoseconds));
					nanoseconds += 1;
				}
				break;
			case UPDATE_ROWS:
			case EXT_UPDATE_ROWS:
				for ( Map.Entry<Serializable[], Serializable[]> e : updateRowsData().getRows() ) {
					Serializable[] data = e.getValue();
					Serializable[] oldData = e.getKey();

					RowMap r = buildRowMap("update", position, nextPosition, data, table, updateRowsData().getIncludedColumns(), rowQuery, nanoseconds);
					writeOldData(table, r, oldData, updateRowsData().getIncludedColumnsBeforeUpdate());
					list.add(r);
					nanoseconds += 1;
				}
				break;
		}

		return list;
	}
}
