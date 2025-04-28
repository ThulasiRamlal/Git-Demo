package com.login.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     @Column
	private int userId;
     @Column
	private String name;
     @Column
	private String username;
     @Column
	private String password;
     @Column
     private String gender;
     @Column
	private String dob;
	
	@ElementCollection(targetClass=String.class)
	private List<String> technology;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String name, String username, String password, String dob,String gender, List<String> technology) {
		super();
		this.userId = userId;
		this.name = name;
		this.username = username;
		this.password = password;
		this.dob = dob;
		this.gender=gender;
		this.technology = technology;
	}
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	//=======================
	public String getGender() {
		return username;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getTechnology() {
		return technology;
	}

	public void setTechnology(List<String> technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", gender=" + gender + ", dob=" + dob + ", technology=" + technology + "]";
	}

	
	
	
	
	
}
