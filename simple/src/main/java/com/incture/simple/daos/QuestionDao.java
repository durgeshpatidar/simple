package com.incture.simple.daos;

import org.springframework.stereotype.Repository;

import com.incture.simple.dtos.QuestionDto;
import com.incture.simple.entities.QuestionDo;

@Repository("QuestionDao")
public class QuestionDao extends BaseDao<QuestionDo, QuestionDto> {

	@Override
	protected QuestionDo importDto(QuestionDto questionDto) {
		QuestionDo entity = null;
		if (questionDto != null) {
			entity = new QuestionDo();
			entity.setQId(questionDto.getQId());
			entity.setQuestion(questionDto.getQuestion());
			entity.setSurveyId(questionDto.getSurveyId());

		}
		return entity;

	}

	@Override
	protected QuestionDto exportDto(QuestionDo entity) {
		QuestionDto dto = null;
		if (entity != null) {
		}
		return dto;

	}

	public void addQuestion(QuestionDto questionDto) {

		questionDto.setQId("5");
		QuestionDo newAdd = importDto(questionDto);
		getSession().save(newAdd);

	}

	public void deleteQuestion(String qId, String sId) {
		QuestionDto rDto = new QuestionDto();
		rDto.setQId(qId);
		rDto.setSurveyId(sId);
		getSession().delete(importDto(rDto));

	}

}
