package com.cognizant.employee.Model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Department {
		@NotNull
		@Digits(fraction = 0, integer = 6)
		private int id;
		@NotNull
		@Size(min=1, max=30)
		private String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Department [id=" + id + ", name=" + name + "]";
		}
		public Department(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public Department() {
			super();
			// TODO Auto-generated constructor stub
		}
		
	}

