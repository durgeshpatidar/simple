package com.incture.simple.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.incture.simple.dtos.*;
import com.incture.simple.services.*;
import com.incture.simple.servicesUtil.ResponseDto;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	@PostMapping("/add")
	private ResponseDto addQuestion(@RequestBody QuestionDto questionDto) {
		return questionService.addQuestion(questionDto);
	}

	@PostMapping("/remove")
	private ResponseDto removeQuestion(@RequestParam String qId, @RequestParam String surveyId) {
		return questionService.deleteQuestion(qId, surveyId);
	}

}
