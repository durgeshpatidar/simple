package com.incture.simple.dtos;
public class QuestionDto extends BaseDto{
    
    
    private String qId;
    private String question;
    private String surveyId;
    
    public QuestionDto()
    {
        super();
    }
    public QuestionDto(String qid,String question,String surveyId)
    {
        super();
        this.qId=qid;
        this.question=question;
        this.surveyId=surveyId;
        
    }
    
    
    
    public String getQId() { return qId; }
    public String getSurveyId() { return surveyId; }
    public String getQuestion() { return question; }
    
    public void setQId(String qId) { this.qId = qId; }
    public void setSurveyId(String sid) { this.surveyId = sid; }
    public void setQuestion(String question) { this.question = question; }
}