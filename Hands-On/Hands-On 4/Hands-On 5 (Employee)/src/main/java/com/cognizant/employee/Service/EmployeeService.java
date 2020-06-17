package com.cognizant.employee.Service;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.cognizant.employee.Dao.EmployeeDao;
import com.cognizant.employee.Model.Employee;





@Service
public class EmployeeService {
	EmployeeDao empDao = new EmployeeDao();
	
	public  ArrayList<Employee> getAllEmployees() {
		return empDao.getAllEmployees();
	}
	public void UpdateEmployee(int id,Employee emp1)
	{
		empDao.UpdateEmployee(id, emp1);
		return ;
	}
	public void deleteEmployee(int id)
	{
		empDao.deleteEmployee(id);
		return;
	}
}