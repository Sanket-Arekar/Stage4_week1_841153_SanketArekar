package com.cognizant.employee.controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.employee.Model.Employee;
import com.cognizant.employee.Service.EmployeeService;




@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	EmployeeService empService;
	
	@GetMapping("/employees")
	public ArrayList<Employee> getAllEmployees() {
	return empService.getAllEmployees();
	}
	@PutMapping("/{id}")
	public void UpdateEmployee(@RequestBody Employee emp,@PathVariable int id)
	{
		empService.UpdateEmployee(id, emp);
		return;
	}
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable int id)
	{
		empService.deleteEmployee(id);
		return;
	}
	
}
