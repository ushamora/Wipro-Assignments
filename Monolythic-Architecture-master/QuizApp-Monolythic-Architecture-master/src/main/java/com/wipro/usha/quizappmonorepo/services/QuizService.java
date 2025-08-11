package com.wipro.usha.quizappmonorepo.services;



import java.util.List;

import com.wipro.usha.quizappmonorepo.entities.QuestionWrapper;
import com.wipro.usha.quizappmonorepo.entities.Quiz;
import com.wipro.usha.quizappmonorepo.entities.Response;


public interface QuizService  {

	 Quiz createQuiz(String category, String level, String title);

	 List<QuestionWrapper> getQuizQuestions(Integer id);

	 Integer calculateResult(int id, List<Response> response);
		

	
}
