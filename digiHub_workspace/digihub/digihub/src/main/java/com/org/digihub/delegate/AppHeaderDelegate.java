package com.org.digihub.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.digihub.helper.AppHeaderHelper;
import com.org.digihub.vo.DigiAppHeaderVO;

@Component
public class AppHeaderDelegate {
	
	@Autowired
	AppHeaderHelper appHeaderHelper;

	public DigiAppHeaderVO getAppHeaderDetails(String userId, String companyId) {
		return appHeaderHelper.getAppHeaderDetails(userId, companyId);
	}
	
	public String saveAppHeaderDetails(DigiAppHeaderVO appHeaderDetailsObj) {
		return appHeaderHelper.saveAppHeaderDetails(appHeaderDetailsObj);
	}

}
