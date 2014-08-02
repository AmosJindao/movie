package org.movie.bean;

import java.io.Serializable;

/**
 * @author amos
 * @date Jul 27, 2014 8:05:15 PM
 */
public class Movie implements Serializable{
	private static final long serialVersionUID = 4100535157536383913L;
	
	private long id;
	private String movieName;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
}
