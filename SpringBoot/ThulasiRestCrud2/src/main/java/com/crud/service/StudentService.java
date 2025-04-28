package com.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.entity.Student;
@Service
public interface StudentService {
	
	public Student create(Student student);
	public List<Student> fetch();
	public Student update(Student student);
	public String delete(int id);

}
