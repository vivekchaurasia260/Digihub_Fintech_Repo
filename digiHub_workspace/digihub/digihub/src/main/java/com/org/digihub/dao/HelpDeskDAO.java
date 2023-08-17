package com.org.digihub.dao;

import java.util.List;

import com.org.digihub.vo.DigiHelpDeskVO;

public interface HelpDeskDAO {
	public List<DigiHelpDeskVO> getHelpDeskDetails(String userId, String appId);
	public String saveHelpDeskDetails(DigiHelpDeskVO helpDeskDetailsObj);
	
}
