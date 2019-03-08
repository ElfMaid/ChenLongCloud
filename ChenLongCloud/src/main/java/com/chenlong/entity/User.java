package com.chenlong.entity;

public class User {

	private String ID;
	private String username;
	private String password;
	private String name;
	private String Role_ID;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole_ID() {
		return Role_ID;
	}
	public void setRole_ID(String role_ID) {
		Role_ID = role_ID;
	}  
	
	
}
