package com.example.demo.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public class PlayerDetails extends UserDetails {
	public PlayerDetails (String name, String email) {
		super(name,email);
	}
	public PlayerDetails() {
		super();
	}

}
