package com.cognizant.employee.Model;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;


	public class Employee {
		
		@NotNull
		@Digits(fraction = 0, integer = 6)
		private int id;
		@NotNull
		@Size(min=1, max=30)
		private String first;
		@NotNull
		@Size(min=0)
		private float salary;
		@NotNull
		private String permanent;
		@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
		private Date dateOfBirth;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirst() {
			return first;
		}
		public void setFirst(String first) {
			this.first = first;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		public String getPermanent() {
			return permanent;
		}
		public void setPermanent(String permanent) {
			this.permanent = permanent;
		}
		public Date getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
         	
		

	}

	

