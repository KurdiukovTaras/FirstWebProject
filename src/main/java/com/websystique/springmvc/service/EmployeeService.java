package com.websystique.springmvc.service;

import java.util.List;

import com.websystique.springmvc.model.Employee;

public interface EmployeeService {

	Employee findById(Integer id);
	
	void saveEmployee(Employee employee);
	
	void updateEmployee(Employee employee);
	
	void deleteEmployeeById(String id);

	List<Employee> findAllEmployees(); 
	
	Employee findEmployeeById(Integer id);

	
}
