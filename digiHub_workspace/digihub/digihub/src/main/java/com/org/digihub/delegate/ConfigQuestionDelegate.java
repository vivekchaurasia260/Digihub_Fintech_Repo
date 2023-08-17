package com.org.digihub.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.digihub.helper.ConfigQuestionHelper;
import com.org.digihub.vo.DigiAppHeaderVO;
import com.org.digihub.vo.DigiConfigQuestionVO;

@Component
public class ConfigQuestionDelegate {
	
	@Autowired
	ConfigQuestionHelper configQuestionHelper;
	
	public DigiConfigQuestionVO getConfigQuestionDetails(String pId, String sectionId) {
		return configQuestionHelper.getAppHeaderDetails(pId, sectionId);
	}
	
	public String saveConfigQuestionDetails(DigiConfigQuestionVO configQuestionDetailsObj) {
		return configQuestionHelper.saveConfigQuestionDetails(configQuestionDetailsObj);
	}
}
