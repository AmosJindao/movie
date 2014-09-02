package org.movie.commons.utils.json.gson;

import java.util.Date;

import org.movie.commons.utils.DateUtils;
import org.movie.commons.utils.json.gson.GsonUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.Gson;

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
		Assert.assertTrue(gson1 instanceof  TestGson,"解析失敗" );
		
		String newJson = "{\"id\":98,\"name\":\"gson\",\"date\":"+System.currentTimeMillis()+"}";
		TestGson gson2 = gson.fromJson(newJson, TestGson.class);
		Assert.assertNotNull(gson2);
		Assert.assertTrue( gson2 instanceof  TestGson, "解析失敗");
		Assert.assertNotNull(gson2.date);
	}
}

class TestGson{
	public int id;
	public String name;
	public Date date;
}
