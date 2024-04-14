package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PlayerDetails;
import com.example.demo.dto.UserDetails;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("users")
	List<UserDetails> getAllUsers(){
		return userService.getAllUsers();
	}
	@GetMapping("players")
	List<PlayerDetails> getAllPlayers(){
		return userService.getAllPlayers();
	}
	@PostMapping("addplayer")
	void createPlayer(@RequestBody PlayerDetails playerDetails) {
		 userService.addPlayer(playerDetails);
	}
}
