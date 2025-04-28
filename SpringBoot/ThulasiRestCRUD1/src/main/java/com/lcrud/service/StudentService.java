package com.lcrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lcrud.entity.StudentEntity;

@Service
public interface StudentService  {
	
	public StudentEntity saveStudent(StudentEntity studentEntity);
	public List<StudentEntity> fetchStudent();
	public StudentEntity updateStudent(StudentEntity studentEntity);
	public String deleteStudent(int id);
	public StudentEntity fetchstudentid(int id);
	

}
