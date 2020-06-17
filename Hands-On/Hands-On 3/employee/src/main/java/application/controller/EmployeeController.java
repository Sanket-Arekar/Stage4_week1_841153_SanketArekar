package application.controller;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import model.Employee;

import service.EmpServiceImpl;


@RestController

public class EmployeeController {
		
	
	@Autowired
	EmpServiceImpl service;
	public EmployeeController() {
		service=new EmpServiceImpl();
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllAccount() {
		 
		return service.getAllEmployee();	}
	

}
