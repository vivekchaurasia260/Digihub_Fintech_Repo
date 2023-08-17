package com.org.digihub.dao;

import com.org.digihub.vo.DigiAppQuestionVO;

public interface AppQuestionDAO {
	public DigiAppQuestionVO getAppQuestionDetails(String userId, String appId);
	public String saveAppQuestionDetails(DigiAppQuestionVO appQuestionDetailsObj);
}
