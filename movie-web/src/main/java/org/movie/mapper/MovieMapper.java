package org.movie.mapper;

import java.util.List;

import org.movie.bean.Movie;
import org.springframework.stereotype.Repository;

/**
 * @author amos
 * @since 1.0, Sep 8, 2014 9:33:00 PM
 */
@Repository
public interface MovieMapper {
	
	/**
	 * 
	 * @return
	 */
	public List<Movie> findMovie();
}
