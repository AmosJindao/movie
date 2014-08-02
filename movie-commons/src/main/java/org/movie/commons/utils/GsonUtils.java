package org.movie.commons.utils;

import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author amos
 * @date Aug 2, 2014 11:13:54 AM
 */
public final class GsonUtils {
	private static GsonDateTypeAdapter gsonDateTypeAdapter = new GsonDateTypeAdapter();
	private static GsonBuilder gsonBuilder = new GsonBuilder();
	
	/**
	 * 通過次方法返回的{@link com.google.gson.Gson}，能夠將長整型解析成爲{@link java.util.Date}類的對象
	 * @return
	 */
	public static final Gson getGson(){
		return gsonBuilder.registerTypeHierarchyAdapter(Date.class,gsonDateTypeAdapter).create();
	}
	
	public static final void setDateFormat(String format){
		gsonDateTypeAdapter.setLocalFormat(format);
	}
}
