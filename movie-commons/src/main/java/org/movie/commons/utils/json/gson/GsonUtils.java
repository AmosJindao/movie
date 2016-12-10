package org.movie.commons.utils.json.gson;

import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author amos
 * @date Aug 2, 2014
 */
public final class GsonUtils {
	private static GsonDateTypeAdapter gsonDateTypeAdapter = new GsonDateTypeAdapter();
	private static GsonBuilder gsonBuilder = new GsonBuilder();
	
	public static final Gson getGson(){
		return gsonBuilder.registerTypeHierarchyAdapter(Date.class,gsonDateTypeAdapter).create();
	}
	
	public static final void setDateFormat(String format){
		gsonDateTypeAdapter.setLocalFormat(format);
	}
}
