package com.incture.simple.services;

import org.springframework.beans.factory.annotation.Autowired;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.incture.simple.daos.QuestionDao;
import com.incture.simple.dtos.QuestionDto;
import com.incture.simple.servicesUtil.ResponseDto;

@Service
@Transactional
public class QuestionService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private QuestionDao questionDao;

	public ResponseDto addQuestion(QuestionDto questionDto) {

		logger.info("questionService | addquestion | Execution start input " + questionDto);

		ResponseDto responseDto = new ResponseDto();
		responseDto.setStatus(Boolean.TRUE);
		responseDto.setStatusCode(200);
		try {
			questionDao.addQuestion(questionDto);
			responseDto.setMessage("question Added");

		} catch (Exception e) {

			logger.error("questionService | addquestion | Exception " + e.getMessage());
			responseDto.setStatus(Boolean.FALSE);
			responseDto.setStatusCode(500);
			responseDto.setMessage(e.getMessage());

		}

		logger.info("questionService | addquestion |  Execution end ouput " + responseDto);

		return responseDto;

	}

	public ResponseDto deleteQuestion(String qId, String sId) {
		logger.info("questionService | deletequestion | Execution start input " + qId);

		ResponseDto responseDto = new ResponseDto();
		responseDto.setStatus(Boolean.TRUE);
		responseDto.setStatusCode(200);
		try {
			questionDao.deleteQuestion(qId, sId);
			responseDto.setMessage("question deleteed");

		} catch (Exception e) {

			logger.error("questionService | deletequestion | Exception " + e.getMessage());
			responseDto.setStatus(Boolean.FALSE);
			responseDto.setStatusCode(500);
			responseDto.setMessage(e.getMessage());

		}

		logger.info("questionService | deletequestion |  Execution end ouput " + responseDto);

		return responseDto;

	}

}
