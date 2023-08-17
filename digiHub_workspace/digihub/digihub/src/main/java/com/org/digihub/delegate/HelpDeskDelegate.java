package com.org.digihub.delegate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.org.digihub.helper.HelpDeskHelper;
import com.org.digihub.vo.DigiHelpDeskVO;

@Component

public class HelpDeskDelegate {
	@Autowired
	HelpDeskHelper helpDeskHelper;
	

	public List<DigiHelpDeskVO> getHelpDeskDetails(String userId, String appId) {
		return helpDeskHelper.getHelpDeskDetails(userId, appId);
	}
	
	public String saveHeaderDetails(DigiHelpDeskVO helpDeskDetailsObj) {
		return helpDeskHelper.saveHelpDeskDetails(helpDeskDetailsObj);
	}

}
