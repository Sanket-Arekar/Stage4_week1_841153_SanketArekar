package model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/*entity class for Employees*/

@Entity
@Component
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String EmpNo;
	@Column
	private String firstName;
	@Column
	private String lastName;
	


	@Override
	public String toString() {
		return "Employee [EmpNo=" + EmpNo + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public void setEmpNo(String empNo) {
		EmpNo = empNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	
}
