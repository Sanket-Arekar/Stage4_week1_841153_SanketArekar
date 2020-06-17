package com.example.restservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Country not Found Exception Occured")
public class CountryNotFoundException extends RuntimeException{
	 
}
