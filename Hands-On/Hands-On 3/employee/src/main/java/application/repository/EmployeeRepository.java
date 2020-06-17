package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Employee;
/* user reposatory class*/
public interface EmployeeRepository extends JpaRepository<Employee,String>{

}
