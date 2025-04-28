package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Student;
import com.crud.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@PostMapping("/createStudent")
	public Student createStudent(@RequestBody Student student)
	
	{
		return studentService.create(student);
	}
	
	@GetMapping("/fetchStudent")
	public List<Student> readStudent()
	{
		return studentService.fetch();
	}
	
	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody  Student student)
	{
		return studentService.update(student);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		return studentService.delete(id);
	}
	
	
	
	
	
	
}
