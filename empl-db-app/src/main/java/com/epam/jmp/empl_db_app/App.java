package com.epam.jmp.empl_db_app;

import java.math.BigDecimal;
import java.util.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.epam.jmp.dao.EmployeeDAO;
import com.epam.jmp.model.Employee;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    	EmployeeDAO dao = context.getBean(EmployeeDAO.class);
    	
    	Employee firstEmpl = new Employee();
    	firstEmpl.setFirstName("Petr");
    	firstEmpl.setLastName("Petrov");
    	firstEmpl.setHireDate(new Date());
    	firstEmpl.setGender("Male");
    	firstEmpl.setPosition("President");
    	firstEmpl.setSalary(new BigDecimal(100));
    	dao.addEmployee(firstEmpl);
    	
    	Employee secondEmpl = new Employee();
    	secondEmpl.setFirstName("Ivan");
    	secondEmpl.setLastName("Ivanov");
    	secondEmpl.setHireDate(new Date());
    	secondEmpl.setGender("Male");
    	secondEmpl.setPosition("Vice-President");
    	secondEmpl.setSalary(new BigDecimal(50));
    	dao.addEmployee(secondEmpl);
    	
    	Employee employee= dao.findEmployee("Ivan", "Ivanov");
    	if(employee != null){
    		System.out.println(employee.toString());
    	} else {
    		System.out.println("Not found");
    	}
    	
    }
}
