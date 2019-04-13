package org.movie.dao;

import java.util.ArrayList;
import java.util.List;

import org.movie.BaseTest;
import org.movie.bean.Movie;
import org.springframework.beans.factory.annotation.Autowired;
//import org.testng.annotations.Test;

/**
 * @author amos
 * @since 1.0, Oct 22, 2014 9:28:11 PM
 */
public class MovieDaoTest extends BaseTest {
	
	@Autowired
	MovieDao movieDao;
	
//	@Test
	public void batchInsertMovie(){
		List<Movie> mList = new ArrayList<>();
		
		Movie m1= new Movie();
		m1.setMovieName("m1");
		
		mList.add(m1);
		
		Movie m2= new Movie();
		m2.setMovieName("m2");
		
		mList.add(m2);
		
		movieDao.batchInsertMovie(mList);
	}
}
