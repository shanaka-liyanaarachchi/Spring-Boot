package com.example.demo.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserDetails {
	private String name;
	private String email;
	public UserDetails(String name, String email) {
		this.name=name;
		this.email=email;
	}
	public UserDetails() {}
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
}
