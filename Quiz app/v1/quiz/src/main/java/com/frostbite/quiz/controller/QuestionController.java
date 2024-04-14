package com.frostbite.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frostbite.quiz.service.QuestionService;
import com.frostbite.quiz.dto.Question;
@RestController
@RequestMapping("questions")
public class QuestionController {
	@Autowired
	QuestionService questionService;
	
	@GetMapping("allquestions")
	public List<Question> getAllQestions() {
		return questionService.getAllQuestions();
	}

}
