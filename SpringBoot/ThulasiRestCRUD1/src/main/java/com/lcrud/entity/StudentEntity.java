package com.lcrud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {
	
	//Private Variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private int marks;
	
	//Default Constructor
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parametrized Constructor
	public StudentEntity(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	//Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	//Getters
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	
	//toString() method from object class
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	
	
	
}
