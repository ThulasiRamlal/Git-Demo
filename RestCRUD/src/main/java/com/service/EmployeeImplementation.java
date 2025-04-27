package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.Employee;

@Service
public interface EmployeeImplementation {

	public Employee createEmployee(Employee employee);
	public List<Employee> fetchEmployee();
	public Employee fetchById(int id);
	public Employee updateEmployee(Employee employee);
	public  String deleteEmployee(int id);
}
