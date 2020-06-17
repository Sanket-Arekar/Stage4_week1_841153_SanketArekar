package com.example.restservice;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class CountryController {

	

	@GetMapping("/country")
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
	
	@GetMapping("/countries/{code}")
	@ResponseBody
	public Country getCountry(@PathVariable String code) {
		Country country = CountryService.getCountry(code);
		return country;
	}
}