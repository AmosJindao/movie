package org.movie.commons.utils;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author amos
 * @since 1.0, Aug 31, 2014
 */
@Test(groups={"strs","commons"})
public class StringUtilsTest {
	
	@Test()
	public void isEmpty(){
		String str = "";
		Assert.assertTrue(StringUtils.isEmpty(str));
		
		str = "   ";
		Assert.assertTrue(StringUtils.isEmpty(str));
		
		str = null;
		Assert.assertTrue(StringUtils.isEmpty(str));
		
		str = "abcd";
		Assert.assertEquals(StringUtils.isEmpty(str), false);
		
	}
	
	@Test(dataProvider="numericObj")
	public void isNumeric(T1 obj){
		String numStr = "";
		Assert.assertEquals(StringUtils.isNumeric(numStr), false);
		
		numStr = "123";
		Assert.assertTrue(StringUtils.isNumeric(numStr));
		
		numStr = "1b23";
		Assert.assertEquals(StringUtils.isNumeric(numStr), false);
		
		Date dt = new Date();
		Assert.assertEquals(StringUtils.isNumeric(dt), false);
		
		Assert.assertTrue(StringUtils.isNumeric(obj));
	}
	
	@Test
	public void unicodeToChinese(){
		String unicode = "\u656c\u754f\u751f\u547d";
		
		String str = StringUtils.unicodeToChinese(unicode);
		
		Assert.assertTrue(StringUtils.isChinese(str));
	}
	
	@Test
	public void toUnderlineStyle(){
		String name = "orderCodeSn";
		
		Assert.assertEquals(StringUtils.toUnderlineStyle(name), "order_code_sn");
	}
	
	@Test
	public void isChinesePunctuation(){
		char ch = '，';
		Assert.assertTrue(StringUtils.isChinesePunctuation(ch));
		
		ch = '從';
		Assert.assertEquals(StringUtils.isChinesePunctuation(ch), false);
	}
	
	@Test
	public void isChineseCharacter() throws UnsupportedEncodingException{
		char ch = '菩';
		Assert.assertTrue(StringUtils.isChineseCharacter(ch));
		ch = 'p';
		Assert.assertEquals(StringUtils.isChineseCharacter(ch), false);
		
		ch = '，';
		Assert.assertEquals(StringUtils.isChineseCharacter(ch), false);
	}
	
	@Test
	public void isChineseByScript(){
		char ch = '菩';
		Assert.assertTrue(StringUtils.isChineseByScript(ch));
		ch = 'p';
		Assert.assertEquals(StringUtils.isChineseByScript(ch), false);
		
		ch = '，';
		Assert.assertEquals(StringUtils.isChineseByScript(ch), false);
	}

	@Test
	public void randomString(){
		Assert.expectThrows(IllegalArgumentException.class, ()->{
			StringUtils.randomString(-1);
		});

		int length = 6;
		String rStr = StringUtils.randomString(length);
		Assert.assertNotNull(rStr);
		Assert.assertEquals(length,rStr.length());
	}
	
	@DataProvider(name="numericObj")
	public Object[][] createNumericObj(){
		T1 t1 = new T1();
		
		t1.name = "amos";
		t1.date = new Date();
		
		
		return  new Object[][] {{t1}};
	}
	private class T1{
		public String name;
		public Date date;
		public int age;

		public String toString(){

			if(date != null){

			}
			return "12345";
		}
	}
}

