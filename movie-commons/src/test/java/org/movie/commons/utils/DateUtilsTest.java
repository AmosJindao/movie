package org.movie.commons.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

/**
 * @author amos
 * @date Aug 2, 2014 11:45:06 AM
 */
public class DateUtilsTest {
	private final DateFormat localFormat
    = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT);
	
	@Test
	public void testDateFormat() throws ParseException{
		DateFormat df = new SimpleDateFormat(DateUtils.DATE_FORMAT_DEFAULT);
		System.out.println(df.format(new Date()));
		System.out.println(localFormat.format(new Date()));
		
		Date date = df.parse("2014-08-02 11:58:20");
	}
}
