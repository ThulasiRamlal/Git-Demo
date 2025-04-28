package com.web;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@Column
	private String userId;
	@Column
	private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + "]";
	}
	
	
	
	
	

}
