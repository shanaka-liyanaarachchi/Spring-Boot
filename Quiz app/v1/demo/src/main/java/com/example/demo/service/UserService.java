package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PlayerDetails;
import com.example.demo.dto.UserDetails;
import com.example.demo.repositry.PlayerRepositry;
import com.example.demo.dao.Players;

@Service
public class UserService {
	@Autowired
	PlayerRepositry playerRepositry;
	@Autowired
	ModelMapper mapper;
	
	public List<UserDetails> getAllUsers() {
		// TODO load allthe users
		List<UserDetails> users = new ArrayList<>();
		users.add(new UserDetails("user1","user1@abc.com"));
		return users;
	}
	
	public List<PlayerDetails> getAllPlayers() {
		// TODO load allthe users
		List<PlayerDetails> playerDetails = new ArrayList<>();
		playerRepositry.findAll().forEach((player)->{
			playerDetails.add(this.mapper.map(player, PlayerDetails.class));
		});
		//users.add(new UserDetails("user1","user1@abc.com"));
		return playerDetails;
	}
	
	public void addPlayer(PlayerDetails playerDetails) {
		this.playerRepositry.save(mapper.map(playerDetails, Players.class));
		
	}

}
