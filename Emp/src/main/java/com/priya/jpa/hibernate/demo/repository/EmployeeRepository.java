//package com.priya.jpa.hibernate.demo.repository;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.priya.jpa.hibernate.demo.entity.Employee;
//
//import jakarta.persistence.EntityManager;
//import jakarta.transaction.Transactional;
//
//@Repository
//@Transactional
//public class EmployeeRepository {
//
//	private Logger logger = LoggerFactory.getLogger(this.getClass());
//	@Autowired
//	EntityManager entityManager;
//
//
//	// public Employee findById(Long id)
//
//	// public void deleteById(Long id) --n> delete by using id
//
//	public Employee findById(Long id) {
//		return entityManager.find(Employee.class, id);
//	}
//
//	// public Employee save(Employee employee) --> insert or update
//
//	public Employee save(Employee employee) {
//		if (employee.getId() == null) {
//			// insert
//			entityManager.persist(employee);
//		} else {
//			// update
//			entityManager.merge(employee);
//		}
//		return employee;
//	}
//
//	// public void deleteById(Long id) --n> delete by using id
//	public void deleteById(Long id) {
//		Employee employee = findById(id);
//		entityManager.remove(employee);
//	}
//
//
//
//}
