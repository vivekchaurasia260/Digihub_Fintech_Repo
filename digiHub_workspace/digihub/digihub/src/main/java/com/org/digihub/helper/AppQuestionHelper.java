package com.org.digihub.helper;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.digihub.dao.AppQuestionDAO;
import com.org.digihub.vo.DigiAppQuestionVO;

public class AppQuestionHelper {
	@Autowired
	AppQuestionDAO appQuestionDAO;
	
	public DigiAppQuestionVO getAppQuestionDetails(String userId, String companyId) {
		return appQuestionDAO.getAppQuestionDetails(userId, companyId);
	}
	
	public String saveAppQuestionDetails(DigiAppQuestionVO appQuestionDetailsObj) {
		return appQuestionDAO.saveAppQuestionDetails(appQuestionDetailsObj);
	}	
}
