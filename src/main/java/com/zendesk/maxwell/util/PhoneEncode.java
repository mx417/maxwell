package com.zendesk.maxwell.util;

import java.security.MessageDigest;

/**
 * 手机号加密
 */
public class PhoneEncode {

	public static String encryption(String source, String algorithm,String salt) {
		String s = "";
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		char firstDigits[] = {'1', '2', '3', '4', '5', '6', '7', '8'};
		try {
			MessageDigest md = MessageDigest.getInstance(algorithm);
			byte tmp[] = md.digest(addPasswordAndSalt(source, salt).getBytes("utf-8"));
			char str[] = new char[19];
			str[0] = firstDigits[(tmp[0] >>> 4 & 0xf) % 8];
			int k = 1;
			for (int i = 1; i < 19; i++) {
				byte byte0 = tmp[i];
				str[k] = hexDigits[(byte0 >>> 4 & 0xf) % 10];
				k++;
			}
			s = new String(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}

	private static String addPasswordAndSalt(String str, String salt) {
		if (str == null) {
			str = "";
		}
		if ((salt == null) || "".equals(salt)) {
			return str;
		} else {
			return str + "{" + salt.toString() + "}";
		}
	}
}
