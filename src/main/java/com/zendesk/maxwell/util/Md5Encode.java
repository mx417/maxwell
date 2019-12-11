package com.zendesk.maxwell.util;

import java.security.MessageDigest;

/**
 * 加密工具
 */
public class Md5Encode {

	private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d",
			"e", "f" };

	public static String encryption(String str, String algorithm, String salt) {
		String result = "";
		try {
			MessageDigest md = MessageDigest.getInstance(algorithm);
			result = byteArrayToHexString(md.digest(addPasswordAndSalt(str, salt).getBytes("utf-8")));
		} catch (Exception ex) {
		}
		return result;
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

	private static String byteArrayToHexString(byte[] b) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			resultSb.append(byteToHexString(b[i]));
		}
		return resultSb.toString();
	}

	private static String byteToHexString(byte b) {
		int n = b;
		if (n < 0)
			n = 256 + n;
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}

	//EnCodeUtil.toMd5(str, "SHA", str);
}
