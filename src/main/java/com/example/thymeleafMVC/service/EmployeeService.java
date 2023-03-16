package com.example.thymeleafMVC.service;

import java.util.List;

import com.example.thymeleafMVC.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	
	Employee findById(int theId);
	
	void save(Employee theEmployee);
	
	void deleteById(int theId);
	
}
