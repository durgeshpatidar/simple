package com.incture.simple.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Questions")
public class QuestionDo extends BaseDo {

	@Id
	@Column(name = "ID")
	private String qId;

	@Column(name = "QUESTION")
	private String question;

	@Column(name = "SURVEY_ID")
	private String surveyId;

	public QuestionDo() {
		super();
	}

	public QuestionDo(String qId, String question, String surveyId) {
		super();
		this.qId = qId;
		this.question = question;
		this.surveyId = surveyId;

	}

	public String getQId() {
		return qId;
	}

	public String getSurveyId() {
		return surveyId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQId(String qId) {
		this.qId = qId;
	}

	public void setSurveyId(String sId) {
		this.surveyId = sId;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "QuestionDo [qId=" + qId + ", question=" + question + ", surveyId=" + surveyId + "]";
	}

}
