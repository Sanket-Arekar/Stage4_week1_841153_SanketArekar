package com.cognizant.moviecruiser.dao;

import java.util.ArrayList;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;



import com.cognizant.moviecruiser.model.Movie;

@Service
public class MovieDao {
	private final static Logger logger = LoggerFactory.getLogger(MovieDao.class);
	public static List<Movie> Movie_list = new ArrayList<Movie>();
	
	@Autowired
	MovieDao moviedao;
	
	public MovieDao() {
		logger.info("Start");
		ApplicationContext context = new ClassPathXmlApplicationContext("movie.xml");
		Movie_list = context.getBean("movieList", java.util.ArrayList.class);
		logger.debug("Movie : {}", Movie_list.toString());
		logger.info("End");
	}
	
	
	public List<Movie> getMovieListAdmin() {
		
		return Movie_list;
	}

	
	public List<Movie> getMovieListCustomer() {
		
		return Movie_list;
	}

  public void toEditMovie(int id, Movie movie) {
		Movie res=findById(id);
		id=id-1;
        if(res.equals(null)) {
	   			throw new EmptyFoundException();
	       }
	      else
	      {
	    	  Movie_list.get(id).setTitle(movie.getTitle());
	    	  Movie_list.get(id).setActive(movie.isActive());
	    	  Movie_list.get(id).setBoxOffice(movie.getBoxOffice());
	    	  Movie_list.get(id).setDateOfLaunch(movie.getDateOfLaunch());
	    	  Movie_list.get(id).setGenre(movie.getGenre());
	    	  Movie_list.get(id).setHasTeaser(movie.isHasTeaser());
		
	       }
		  return;
		
	}

	public Movie findById(int mv_id) {
		Movie m=Movie_list.get(mv_id);
		return m;
	}

}
