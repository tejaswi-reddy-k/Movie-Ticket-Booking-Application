package com.movie.app.entity;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class User {
	
	@Id
	private int userId;
	@NotNull(message="password should not be empty")
	private String password;
	@NotNull(message="please mention role of the user")
	private String role;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
