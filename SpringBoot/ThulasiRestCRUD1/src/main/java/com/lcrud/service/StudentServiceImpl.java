package com.lcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcrud.entity.StudentEntity;
import com.lcrud.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public StudentEntity saveStudent(StudentEntity studentEntity) {
		// TODO Auto-generated method stub
		StudentEntity se=studentRepository.save(studentEntity);
		return se;
	}

	@Override
	public List<StudentEntity> fetchStudent() {
		// TODO Auto-generated method stub
		
		return studentRepository.findAll();
	}

	@Override
	public StudentEntity updateStudent(StudentEntity studentEntity) {
		// TODO Auto-generated method stub
		return studentRepository.save(studentEntity);
	}

	@Override
	public String deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		return "Succefully deleted "+id;
	}

	@Override
	public StudentEntity fetchstudentid(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

}
