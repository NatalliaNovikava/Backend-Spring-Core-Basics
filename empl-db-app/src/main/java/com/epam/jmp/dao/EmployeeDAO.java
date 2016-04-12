package com.epam.jmp.dao;

import com.epam.jmp.model.Employee;

public interface EmployeeDAO {
	public Employee findEmployee(String firstName, String lastName);
	public void addEmployee(Employee employee);
}
