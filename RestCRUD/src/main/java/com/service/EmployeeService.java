package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeService implements EmployeeImplementation {

	@Autowired
	EmployeeRepository emprepository;
	
	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return emprepository.save(employee);
	}

	@Override
	public List<Employee> fetchEmployee() {
		// TODO Auto-generated method stub
		return emprepository.findAll() ;
	}

	@Override
	public Employee fetchById(int id) {
		// TODO Auto-generated method stub
		return emprepository.findById(id).orElse(null);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return emprepository.save(employee);
	}

	@Override
	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		emprepository.deleteById(id);
		return "Succesful DELETED...";
	}

}
