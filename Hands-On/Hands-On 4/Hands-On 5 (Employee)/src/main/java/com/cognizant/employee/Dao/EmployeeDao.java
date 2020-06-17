package com.cognizant.employee.Dao;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.employee.Exception.EmployeeNotFoundException;
import com.cognizant.employee.Model.Employee;




public class EmployeeDao {
private final static Logger logger = LoggerFactory.getLogger(EmployeeDao.class);
	
	public static ArrayList<Employee> Employee_list = new ArrayList<Employee>();
	
	public EmployeeDao() {
		logger.info("Start");
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		Employee_list = context.getBean("employeeList", java.util.ArrayList.class);
		logger.debug("Employee : {}", Employee_list.toString());
		logger.info("End");
	}
	
	public ArrayList<Employee> getAllEmployees() {
		return Employee_list;
	}
	public static Employee findEmployee(int id)
	{   for(Employee g : Employee_list) {
        	 
             if(g.getId()==id)
             {
                return g;
             }
         }
    	return null;
     }
	public void UpdateEmployee(int id,Employee emp1)
	{
		Employee emp=findEmployee(id);
		if(emp.equals(null)) {
			throw new EmployeeNotFoundException();
		}
		else
		{
			emp.setId(emp1.getId());
			emp.setDateOfBirth(emp1.getDateOfBirth());
			emp.setFirst(emp1.getFirst());
			emp.setPermanent(emp1.getPermanent());
			emp.setSalary(emp.getSalary());
		}
		return ;
		
	}
	public void deleteEmployee(int id)
	{
		Employee emp=findEmployee(id);
		if(emp.equals(null)) {
			throw new EmployeeNotFoundException();
		}
		else
		{
		   Employee_list.remove(id);
		}
		return;
	}
	
}
