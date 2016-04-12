package com.epam.jmp.model;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {
		private int id;
		private String firstName;
		private String lastName;
		private Date hire_date;
		private String gender;
		private String position;
		private BigDecimal salary;

		public int getId() {
			return id;
		}

		
		public void setId(int id) {
			this.id = id;
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

		public Date getDate() {
			return hire_date;
		}

		public void setHireDate(Date hire_date) {
			this.hire_date = hire_date;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public BigDecimal getSalary() {
			return salary;
		}

		public void setSalary(BigDecimal salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", hire_date=" + hire_date
					+ ", gender=" + gender + ", position=" + position + ", salary=" + salary + "]";
		}

}

