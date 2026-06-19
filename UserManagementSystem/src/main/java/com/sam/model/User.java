package com.sam.model;

import jakarta.persistence.*;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	private String username;
	private String name;
	private String email;
	
	public User() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsename(String username) {
		this.username = username;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "User [ User Id =" + id + ", Username=" + username + ", Name=" + name + ", Email=" + email + "]";
	}

}
