package com.cognizant.employee.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Employee not Found Exception Occured")
public class EmployeeNotFoundException extends RuntimeException {

}
