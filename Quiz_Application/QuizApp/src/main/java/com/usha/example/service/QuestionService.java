package com.usha.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.usha.example.entities.Question;
import com.usha.example.enums.Category;
import com.usha.example.repos.QuestionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionService {
	
	private final QuestionRepository questionRepository;

	public List<Question> getQuestionsByCategory(Category category) {
		
           return questionRepository.findByCategory(category);

    }

    public Question addQuestion(Question question) {
        
        return questionRepository.save(question);
    }
}
