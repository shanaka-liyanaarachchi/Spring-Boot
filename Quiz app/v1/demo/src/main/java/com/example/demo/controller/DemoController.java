package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DemoModel;

@RestController	

public class DemoController {
	@GetMapping("demo")
	String read() {
		return "Hello";
	}
	@PostMapping("demo1")
	String craete(@RequestBody DemoModel body) {
		return "Context: " + body.text;
	}

}
