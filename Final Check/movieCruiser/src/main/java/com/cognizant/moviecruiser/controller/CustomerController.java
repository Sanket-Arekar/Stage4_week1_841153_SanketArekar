package com.cognizant.moviecruiser.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.moviecruiser.dao.EmptyFoundException;
import com.cognizant.moviecruiser.dao.FavoritesDao;

import com.cognizant.moviecruiser.dao.MovieDao;
import com.cognizant.moviecruiser.model.Movie;


@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	MovieDao movieDaoSqlImpl;
	
	@Autowired
	FavoritesDao favDaoSqlImpl;
	
	static List<Movie> listcust;
	List<Movie> list = null;
	
	@GetMapping("/movielist")
	public List<Movie> getMainPage()
	{
	 listcust=movieDaoSqlImpl.getMovieListCustomer();
	
		return listcust ;
	}
	
	@GetMapping("/favlist")
	public List<Movie> showFav() {
			list = favDaoSqlImpl.getAllFavoritesMovies(1);
	
			if(list.equals(null))
			{
			throw new EmptyFoundException();
	
			}
			return list;
		}
		
	
	
	@PostMapping("/addtofav/{id}")
	public void addedToFav(@PathVariable int id)
	{
	
		id=id-1;
		favDaoSqlImpl.addFavoritesMovie(id);
	}
		
	
	@DeleteMapping("/delete/{id}")
	public void deleteItem(@PathVariable int id )
	{
	
		favDaoSqlImpl.removeFavoritesMovie(id);
		
	}
	
	

}
