package com.org.digihub.dao;

import com.org.digihub.vo.DigiConfigQuestionVO;

public interface ConfigQuestionDAO {
	
	public DigiConfigQuestionVO getConfigQuestionDetails(String qId);
	public String saveConfigQuestionDetails(DigiConfigQuestionVO configQuestionDetailsObj);
}
