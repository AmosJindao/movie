package org.movie.commons.utils;

import java.util.ResourceBundle;

/**
 * @author amos
 * @date Aug 5, 2014 9:35:48 PM
 */
public final class PropertiesLoader {
	private static ResourceBundle rb;
	static {
		rb = ResourceBundle.getBundle("config/config");
	}

	/**
	 * 獲取key對應的value值，如果沒有設置，則返回空字符串
	 * 
	 * @param key 關鍵字值
	 * @return
	 */
	public static final String getPropertyValue(String key) {
		String value = rb.getString(key);

		return value == null ? "" : value;
	}
}
