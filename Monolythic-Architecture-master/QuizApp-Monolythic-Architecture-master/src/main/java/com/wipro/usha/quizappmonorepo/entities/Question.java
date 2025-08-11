package com.wipro.usha.quizappmonorepo.entities;

import com.wipro.usha.quizappmonorepo.ens.Category;
import com.wipro.usha.quizappmonorepo.ens.Difficult;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String questionTitle;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String correctAnswer;
	private Difficult difficulty;
	private Category category;

}
