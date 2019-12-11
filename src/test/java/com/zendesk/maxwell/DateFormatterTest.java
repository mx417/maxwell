package com.zendesk.maxwell;

import com.zendesk.maxwell.schema.columndef.DateFormatter;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/12/11.
 */
public class DateFormatterTest {

	public static void main(String[] args){
		Long d = 1517615999000000L;

		Timestamp tm = DateFormatter.extractTimestamp(d);

		System.out.println(tm.toString());

		String dateString = DateFormatter.formatDateTime(d, tm, true);

		System.out.println(dateString);
	}

}
