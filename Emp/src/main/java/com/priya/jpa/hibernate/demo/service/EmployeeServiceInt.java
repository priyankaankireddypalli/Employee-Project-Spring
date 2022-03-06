package com.priya.jpa.hibernate.demo.service;

import com.priya.jpa.hibernate.demo.entity.Employee;

public interface EmployeeServiceInt {

	Employee getEmployeeById(long id);
	Employee addEmployeeData(String name,double salary);
	String deleteEmployeeById(long id);
	Employee updateEmployeeById(long id,Employee employee);
	
	
}
