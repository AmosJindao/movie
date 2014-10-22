package org.movie.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.movie.bean.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author amos
 * @since 1.0, Oct 22, 2014 9:21:48 PM
 */
@Repository
public class MovieDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int[] batchInsertMovie(final List<Movie> movieList){
		String sql = "insert into movie (name) values(?)";
		return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Movie m = movieList.get(i);
				
				ps.setString(1, m.getMovieName());
			}
			
			@Override
			public int getBatchSize() {
				return movieList.size();
			}
		});
	}
}
