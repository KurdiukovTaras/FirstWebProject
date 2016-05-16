package com.websystique.springmvc.dao;

import java.util.List;

import com.websystique.springmvc.model.Employee;

public interface EmployeeDao {

	Employee findById(int id);

	void saveEmployee(Employee employee);
	
	void deleteEmployeeById(String id);
	
	List<Employee> findAllEmployees();

	Employee findEmployeeById(Integer id);

}
