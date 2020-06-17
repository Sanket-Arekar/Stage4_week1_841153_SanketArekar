package com.cognizant.truyum;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TruyumApplication {

	//private final static Logger LOGGER = LoggerFactory.getLogger(TruyumApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(TruyumApplication.class, args);
	}	
}