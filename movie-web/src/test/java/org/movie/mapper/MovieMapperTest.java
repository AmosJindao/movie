package org.movie.mapper;

import java.util.List;

import org.movie.BaseTest;
import org.movie.bean.Movie;
import org.springframework.beans.factory.annotation.Autowired;
//import org.testng.Assert;
//import org.testng.annotations.Test;

/**
 * @author amos
 * @since 1.0, Sep 8, 2014 9:42:09 PM
 */
public class MovieMapperTest extends BaseTest{
	
	@Autowired
	MovieMapper movieMapper;
	
//	@Test
	public void findMovie(){
		List<Movie> mlst = movieMapper.findMovie();
System.out.println("亂碼了？");
//		Assert.assertNotNull(mlst);
	}
}
