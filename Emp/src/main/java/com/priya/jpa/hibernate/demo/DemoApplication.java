package com.priya.jpa.hibernate.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.priya.jpa.hibernate.demo.repository.EmployeeRepositoryNew;

@SpringBootApplication
public class DemoApplication {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private EmployeeRepositoryNew repository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Override
////	
//	
//	public void run(String... args) throws Exception {
//		
//		
//		Employee employee  = repository.findById(10001L);
//		logger.info("Employee details of 10001 is {} ",employee);
//		
//		repository.deleteById(10001L);
//		repository.save(new Employee("Priya"));
//		
//
//	}
}
