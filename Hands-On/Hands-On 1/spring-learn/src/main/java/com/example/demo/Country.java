package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	
	private static final Logger logger = LoggerFactory.getLogger(Country.class);
 
    private String code,name;

	public Country() {
		
		logger.debug("Inside Country Constructor");
		
	}
	
	public String toString() {
		
		return code+":"+name;
		
	}

	public String getCode() {
		logger.debug("Inside Code Getter");
		return code;
	}

	public void setCode(String code) {
		logger.debug("Inside Code Setter");
		this.code = code;
	}

	public String getName() {
		logger.debug("Inside Name Getter");
		return name;
	}

	public void setName(String name) {
		logger.debug("Inside Name Setter");
		this.name = name;
	}
	
	
	
}
