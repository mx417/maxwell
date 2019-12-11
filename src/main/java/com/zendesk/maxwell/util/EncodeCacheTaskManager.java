package com.zendesk.maxwell.util;

import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/12/7.
 */
public class EncodeCacheTaskManager {

	static final Logger LOGGER = LoggerFactory.getLogger(EncodeCacheTaskManager.class);

	private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

	private static final String url = "jdbc:mysql://172.20.2.13:3306/platform?characterEncoding=utf8&autoReconnect=true";
	private static final String username = "bigdata_r";
	private static final String password = "3VBLa44Pws7HMENY";
	public static final String jdbcName = "com.mysql.jdbc.Driver";

	private static final String sql = "SELECT table_name, col_name, encryption_type FROM kafka_table_online WHERE encryption_type > 0 ORDER BY table_name";

	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static final Map<String, Map<String, Integer>> encodeColsMap = Maps.newConcurrentMap();

	static {
		//开启定时任务
		scheduler.scheduleAtFixedRate(new TimerTask(), 0L, 1L, TimeUnit.MINUTES);
	}

	static class TimerTask implements Runnable {
		@Override
		public void run() {
			LOGGER.warn("start run get info from meta mysql {}", format.format(new Date()));
			Connection conn = null;
			try {
				Class.forName(jdbcName);
				conn = DriverManager.getConnection(url, username, password);
				Statement statement = conn.createStatement();
				ResultSet res = statement.executeQuery(sql);
				while (res.next()){
					String topicName = res.getString("table_name").toLowerCase();
					String colName = res.getString("col_name");
					Integer encryptionType = res.getInt("encryption_type");
					String[] split = topicName.split("\\.");
					if (split.length > 2) {
						topicName = split[1] + "." + split[2];
					}
					if (!encodeColsMap.containsKey(topicName)){
						Map<String, Integer> s = Maps.newHashMap();
						s.put(colName.toLowerCase(), encryptionType);
						encodeColsMap.put(topicName, s);
					} else {
						encodeColsMap.get(topicName).put(colName.toLowerCase(), encryptionType);
					}
				}
				res.close();
				statement.close();
			} catch (Exception e) {
				LOGGER.error("error to get info {}", e.getMessage());
			} finally {
				LOGGER.warn("end run get info from meta mysql {} cols [{}]", format.format(new Date()), encodeColsMap.size());
				if (conn != null){
					try {
						conn.close();
					} catch (SQLException e) {
						LOGGER.error("error close mysql {}", e.getMessage());
					}
				}
			}
		}
	}
}
