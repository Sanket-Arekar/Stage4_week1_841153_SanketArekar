package com.example.restservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;





@RestController
@RequestMapping("/countries")
public class CountryController {

	

	@GetMapping()
	public Country getCountryIndia() {
       ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
    	
     	Country country = (Country) context.getBean("country", Country.class);
		
		return country;
	}
	@GetMapping("/countries")
	public ArrayList<Country> getAllCountries() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
    	ArrayList<Country> country =new ArrayList<Country>();
    	 country = context.getBean("countryList", java.util.ArrayList.class);
		
		return country;
	}
	
	@GetMapping("/{code}")
	@ResponseBody
	public Country getCountry(@PathVariable String code) {
		Country country = CountryService.getCountry(code);
		return country;
	}
	

	@PostMapping
	public Country addCountry(@RequestBody @Valid Country country){
	return country;
	 }
	
	
	
}