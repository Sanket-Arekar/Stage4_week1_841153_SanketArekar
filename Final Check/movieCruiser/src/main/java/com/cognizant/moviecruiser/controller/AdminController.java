package com.cognizant.moviecruiser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.moviecruiser.dao.MovieDao;
import com.cognizant.moviecruiser.model.Movie;


@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	MovieDao movieDaoSqlImpl;
	
	@GetMapping("/movielist")
	public List<Movie> getadminPage()
	{
		List<Movie> list=movieDaoSqlImpl.getMovieListAdmin();
		
		return list;
	}

	@PutMapping("/{id}")
    public void toEditMovie(@PathVariable int id,@RequestBody Movie movie )
    {
		movieDaoSqlImpl.toEditMovie(id,movie);
		return;
    }
}