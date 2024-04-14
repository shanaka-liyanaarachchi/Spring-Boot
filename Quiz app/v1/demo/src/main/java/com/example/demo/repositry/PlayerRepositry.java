package com.example.demo.repositry;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.dao.Players;

public interface PlayerRepositry extends CrudRepository<Players, Integer> {

	 //void save(com.example.demo.dao.Players map);

}
