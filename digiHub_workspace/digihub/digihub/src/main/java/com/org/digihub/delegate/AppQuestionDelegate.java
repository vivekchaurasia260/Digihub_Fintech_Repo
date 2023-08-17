package com.org.digihub.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.org.digihub.helper.AppQuestionHelper;
import com.org.digihub.vo.DigiAppQuestionVO;

@Component

public class AppQuestionDelegate {

	@Autowired
	AppQuestionHelper appQuestionHelper;

	public DigiAppQuestionVO getAppQuestionDetails(String userId, String appId) {
		return appQuestionHelper.getAppQuestionDetails(userId, appId);
	}
	
	public String saveAppQuestionDetails(DigiAppQuestionVO appQuestionDetailsObj) {
		return appQuestionHelper.saveAppQuestionDetails(appQuestionDetailsObj);
	}
}
