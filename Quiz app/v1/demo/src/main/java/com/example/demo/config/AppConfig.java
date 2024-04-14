package com.example.demo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.UserService;

@Configuration
public class AppConfig {
	@Bean
	ModelMapper getMapper() {
		return new ModelMapper();
	}

}
