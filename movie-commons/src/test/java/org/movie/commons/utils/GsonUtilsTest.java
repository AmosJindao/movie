package org.movie.commons.utils;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author amos
 * @date Aug 2, 2014 11:26:22 AM
 */
public class GsonUtilsTest {
	
	@Test
	public void parseJsonWithLongToDate(){
		GsonUtils.setDateFormat(DateUtils.DATE_FORMAT_DEFAULT);
		Gson gson = GsonUtils.getGson();
		
		String oldJson = "{\"id\":98,\"name\":\"gson\",\"date\":\"2014-08-02 12:01:39\"}";
		TestGson gson1 = gson.fromJson(oldJson, TestGson.class);
		Assert.assertTrue("解析失敗", gson1 instanceof  TestGson);
		
		String newJson = "{\"id\":98,\"name\":\"gson\",\"date\":"+System.currentTimeMillis()+"}";
		TestGson gson2 = gson.fromJson(newJson, TestGson.class);
		Assert.assertTrue("解析失敗", gson2 instanceof  TestGson);
	}
}

class TestGson{
	public int id;
	public String name;
	public Date date;
}
