package com.example.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.SpringLearnApplication;

import com.example.demo.Country;



@SpringBootApplication
public class SpringLearnApplication {
	
	 private static final Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);
	 
	 public static void displayCountries() {
		 logger.info("START");
		 ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		 ArrayList<Country> countryList =new ArrayList<Country>();
    	 countryList = context.getBean("countryList", java.util.ArrayList.class);
		 
		 //System.out.println(countryList);
    	 logger.debug("Country : {}", countryList.toString());
    	 
		 logger.info("END");
	 }
	 
	 public static void displayCountry(){
		 ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		 Country country = (Country) context.getBean("country", Country.class);
		// System.out.println(country);
		 logger.debug("Country : {}", country.toString());
		 Country anotherCountry = context.getBean("country", Country.class);
		 logger.debug("Country : {}", anotherCountry.toString());
	 }

	public static void displayDate() throws ParseException{
		logger.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat",SimpleDateFormat.class);
	    Date date = format.parse("31/12/2018");
		System.out.println(date);
		 
		 logger.debug(format.format(date));
		 logger.info("END");
	    
	}
	
	public static void main(String[] args) throws ParseException {
		SpringApplication.run(SpringLearnApplication.class, args);
		SpringLearnApplication s=new SpringLearnApplication();
		displayDate();
	    //displayCountry();
	    displayCountries();
		 
	    
	}

}