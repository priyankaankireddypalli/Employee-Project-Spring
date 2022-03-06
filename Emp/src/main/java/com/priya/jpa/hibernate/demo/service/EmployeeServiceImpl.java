package com.priya.jpa.hibernate.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priya.jpa.hibernate.demo.entity.Employee;
import com.priya.jpa.hibernate.demo.repository.EmployeeRepositoryNew;
@Service
public class EmployeeServiceImpl implements EmployeeServiceInt {
	
	@Autowired
	EmployeeRepositoryNew employeeRepositoryNew;

	@Override
	public Employee getEmployeeById(long id) {
		return employeeRepositoryNew.findById(id).get();
	}

	@Override
	public Employee addEmployeeData(String name,double salary) {
		Employee employee = new Employee(name,salary);
		return employeeRepositoryNew.save(employee);
		
	}

	@Override
	public String deleteEmployeeById(long id) {
		employeeRepositoryNew.deleteById(id);
		return "Employee deleted by id ="+id;
	}

	@Override
	public Employee updateEmployeeById(long id,Employee employee) {
		Employee employeeData = employeeRepositoryNew.findById(id).orElseGet(null);
		if(employeeData != null) {
		 employeeData.setName(employee.getName());
		 employeeData.setSalary(employee.getSalary());
		 employeeRepositoryNew.save(employeeData);
		}
		return null;
	}
	
	
	
	
	
	
	

}
