package com.frostbite.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frostbite.quiz.dao.QuestionDao;
import com.frostbite.quiz.dto.Question;

@Service
public class QuestionService {
	@Autowired
	QuestionDao questionDao;

	public List<Question> getAllQuestions() {
		// TODO Auto-generated method stub
		return questionDao.findAll();
	}

}
