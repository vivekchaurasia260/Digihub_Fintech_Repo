package com.org.digihub.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.digihub.dao.AppQuestionDAO;
import com.org.digihub.repository.AppQuestionRepository;
import com.org.digihub.vo.DigiAppQuestionVO;

@Service
public class AppQuestionDAOImpl implements AppQuestionDAO{
	@Autowired
	AppQuestionRepository appQuestionRepository; 

	@Override
	public DigiAppQuestionVO getAppQuestionDetails(String userId, String appId) {
		return appQuestionRepository.getAppQuestionDetails(userId, appId);
	}

	@Override
	public String saveAppQuestionDetails(DigiAppQuestionVO appQuestionDetailsObj) {
		String status = "{\"status\":\"success\"}";
		try {
			appQuestionRepository.save(appQuestionDetailsObj);
		} catch (Exception ex) {
			status = "{\"status\":\"error\"}";
		}
		return status;
	}

}
