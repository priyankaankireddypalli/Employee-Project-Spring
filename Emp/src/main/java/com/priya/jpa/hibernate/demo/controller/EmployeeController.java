package com.priya.jpa.hibernate.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.priya.jpa.hibernate.demo.entity.Employee;
import com.priya.jpa.hibernate.demo.service.EmployeeServiceInt;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeServiceInt employeeServiceInt;
	
	@PostMapping("/addEmployee")
	public Employee addEmployeeDataToH2(@RequestParam String name,@RequestParam double salary) {
		Employee addEmployeeData = employeeServiceInt.addEmployeeData(name,salary);
		return addEmployeeData;
		
	}
	
	@GetMapping("/getEmployee")
	public Employee getEmployeeByIdFromH2(@RequestParam long id) {
		Employee employeeById = employeeServiceInt.getEmployeeById(1);
		return employeeById;
	}
	@DeleteMapping("/deleteEmployee")
	public String deleteEmployeeByIdFromH2(@RequestParam long id) {
		String deleteEmployeeById = employeeServiceInt.deleteEmployeeById(1);
		return deleteEmployeeById;
	}
	@PutMapping("/updateEmployee")
	public Employee updateEmployeeByIdToH2(@RequestParam long id, @RequestBody Employee employee) {
		Employee updateEmployeeById = employeeServiceInt.updateEmployeeById(id,employee);
		return updateEmployeeById;
	}
	
	

}
