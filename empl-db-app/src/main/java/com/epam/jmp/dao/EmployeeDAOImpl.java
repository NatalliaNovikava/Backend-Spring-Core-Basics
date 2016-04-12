package com.epam.jmp.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.epam.jmp.model.Employee;

@Repository
public class EmployeeDAOImpl extends JdbcDaoSupport implements EmployeeDAO {

	@Autowired
    private void initDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	public Employee findEmployee(String firstName, String lastName) {
		String sql = "SELECT * FROM EMPLOYEES WHERE FIRST_NAME = ? AND LAST_NAME = ?";

		return getJdbcTemplate().queryForObject(sql, new Object[] { firstName, lastName }, new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	public void addEmployee(Employee employee) {
		String sql = "INSERT INTO EMPLOYEES (first_name, last_name, hire_date, gender, position, salary) VALUES (?, ?, ?, ?, ?, ?)";
		getJdbcTemplate().update(sql, new Object[] { employee.getFirstName(), employee.getLastName(), employee.getDate(),
				employee.getGender(), employee.getPosition(), employee.getSalary()});
	}

}
