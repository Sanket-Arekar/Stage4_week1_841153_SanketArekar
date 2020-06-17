package com.cognizant.moviecruiser.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;



import com.cognizant.moviecruiser.model.Favorites;
import com.cognizant.moviecruiser.model.Movie;

@Service
public class FavoritesDao {
	private final static Logger logger = LoggerFactory.getLogger(FavoritesDao.class);
	public static ArrayList<Favorites> fav_list = new ArrayList<Favorites>();
	List<Movie> movie = new ArrayList<Movie>();
	
	@Autowired
	FavoritesDao favoriteDao;
	
	@Autowired
	MovieDao movieDao;
	
	
	public FavoritesDao() {
	}
	
	
	public void addFavoritesMovie(int movieId) {
		int id=fav_list.size();
		
		Favorites fav=new Favorites(id,1,movieId);
		fav_list.add(fav);
		for (Favorites f : fav_list) {
			Movie movie1 = movieDao.findById(f.getMv_id());
			if(!movie.contains(movie1)) {
				movie.add(movie1);
			}
			logger.debug("fav: {}", fav_list.toString());
		}
		logger.debug("fav: {}", fav_list.toString());
	}
	
	public List<Movie> getAllFavoritesMovies(int userId) throws EmptyFoundException {
		return movie;
	}
	
	public void removeFavoritesMovie(int movieId) {
	    int c=0;
		for(Movie m:movie) {
			if(m.getId() == movieId) {
					movie.remove(c);
			} else {
				c++;
			}
		}
		logger.debug("fav: {}", fav_list.toString());
	}

}
