package com.priya.jpa.hibernate.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priya.jpa.hibernate.demo.entity.Employee;

public interface EmployeeRepositoryNew extends JpaRepository<Employee, Long>{
	

}
