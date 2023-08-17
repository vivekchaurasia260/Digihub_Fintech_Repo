package com.org.digihub.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.digihub.dao.ConfigQuestionDAO;
import com.org.digihub.vo.DigiConfigQuestionVO;

@Component
public class ConfigQuestionHelper {

	@Autowired
	ConfigQuestionDAO configQuestionDAO;
	
	public DigiConfigQuestionVO getAppHeaderDetails(String pId, String sectionId) {
		return configQuestionDAO.getConfigQuestionDetails(pId);
	}
	
	public String saveConfigQuestionDetails(DigiConfigQuestionVO configQuestionDetailsObj) {
		return configQuestionDAO.saveConfigQuestionDetails(configQuestionDetailsObj);
	}	
}
