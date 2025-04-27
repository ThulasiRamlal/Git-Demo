package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee;
import com.service.EmployeeImplementation;
import com.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
    EmployeeImplementation empservice;
	
	@PostMapping("/Employee/create")
	public Employee createEmployee(@RequestBody Employee employee)
	{
		return empservice.createEmployee(employee);
		
	}
	

	@GetMapping("/Employee/fetch")
	public List<Employee> fetchEmployee()
	{
		return empservice.fetchEmployee();
	}
	
	
	@GetMapping("/Employee/fetch/{id}")
	public Employee fetchEmployeeById(int id)
	{
		return empservice.fetchById(id);
	}
	
	
	@PutMapping("/Employee/update/{id}")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return empservice.updateEmployee(employee);
		
	}
	
	
	
	@DeleteMapping("/Employee/delete/{id}")
	public String deleteEmployee(int id)
	{
		return empservice.deleteEmployee(id);
	}
	

}
