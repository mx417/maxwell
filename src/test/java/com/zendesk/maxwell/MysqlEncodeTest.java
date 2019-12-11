package com.zendesk.maxwell;


import static com.zendesk.maxwell.util.EncodeCacheTaskManager.encodeColsMap;

/**
 * Created by Administrator on 2017/12/7.
 */
public class MysqlEncodeTest {

	public static void main(String[] args) throws InterruptedException {

		while (true) {
			Thread.sleep(1000);
			System.out.println(encodeColsMap.size());
		}

	}

}
