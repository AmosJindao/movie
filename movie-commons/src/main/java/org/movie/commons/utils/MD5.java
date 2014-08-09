package org.movie.commons.utils;

import java.security.MessageDigest;

/**
 * @author amos
 * @date May 3, 2014 3:59:39 PM
 */
public final class MD5 {
	private static final char[] hexadecimal = { '0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
	
	public static final String md5L16UpperCase(String input){
		return md5L16(input).toUpperCase();
	}
	
	/**
	 * @param input
	 * @return 長度爲16的小寫加密字符串
	 */
	public static final String md5L16(String input){
		return md5(input).substring(8, 24);
	}
	
	/**
	 * @param input 待加密的字符串
	 * @return 大寫的字符串
	 */
	public static final String md5UpperCase(String input){
		return md5(input).toUpperCase();
	}
	
	/**
	 * @param input 待加密的字符串
	 * @return 小寫的加密字符串
	 */
	public static final String md5(String input) {
		String encodeStr = null;
		try {
			MessageDigest messageDigest = MessageDigest.getInstance(System.getProperty("MD5.algorithm",
					"MD5"));
			byte[] binaryData = messageDigest.digest(input.getBytes("UTF-8"));
			encodeStr = encode(binaryData);
		} catch (Exception e) {
			encodeStr = null;
		}
		return encodeStr;
	}

	/**
	 * 把128位（16字節）MD5編碼成長度爲32的字符串
	 * 
	 * @param binaryData
	 *            16長度的字節數組
	 * @return 編碼MD5，如果失敗則返回<code>null</code>
	 */
	public static final String encode(byte[] binaryData) {
		if (binaryData.length != 16)
			return null;

		char[] buffer = new char[32];

		for (int i = 0; i < 16; i++) {
			int low = binaryData[i] & 0x0f;
			int high = (binaryData[i] & 0xf0) >> 4;
			buffer[i * 2] = hexadecimal[high];
			buffer[i * 2 + 1] = hexadecimal[low];
		}

		return new String(buffer);
	}
}
