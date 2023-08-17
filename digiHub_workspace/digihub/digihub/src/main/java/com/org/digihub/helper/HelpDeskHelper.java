package com.org.digihub.helper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.digihub.dao.HelpDeskDAO;
import com.org.digihub.vo.DigiHelpDeskVO;

public class HelpDeskHelper {
	@Autowired
	HelpDeskDAO helpDeskDAO;
	
	public List<DigiHelpDeskVO> getHelpDeskDetails(String userId, String appId) {
		return helpDeskDAO.getHelpDeskDetails(userId, appId);
	}
	
	public String saveHelpDeskDetails(DigiHelpDeskVO helpDeskDetailsObj) {
		return helpDeskDAO.saveHelpDeskDetails(helpDeskDetailsObj);
	}	
}
