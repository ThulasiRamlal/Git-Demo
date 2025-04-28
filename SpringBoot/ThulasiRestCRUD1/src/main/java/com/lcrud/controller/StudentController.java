package com.lcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lcrud.entity.StudentEntity;
import com.lcrud.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/savestudent")
	public StudentEntity saveStudent(@RequestBody StudentEntity studentEntity)
	{
		return studentService.saveStudent(studentEntity);
	}
	
	@GetMapping("/fetchstudent")
	public List<StudentEntity> fetchStudent()
	{
		return studentService.fetchStudent();
	}
	
	@PutMapping("/updatestudent")
	public StudentEntity updateStudent(@RequestBody StudentEntity studentEntity)
	{
		return studentService.updateStudent(studentEntity);
	}
	
	@DeleteMapping("/deletestudent/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		return studentService.deleteStudent(id);
	}
	
	@GetMapping("/fetchstudentid/{id}")
	public StudentEntity fetchStudentid(@PathVariable int id)
	{
		return studentService.fetchstudentid(id);
	}
	
	
	
	
}
