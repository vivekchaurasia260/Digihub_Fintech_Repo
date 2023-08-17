package com.org.digihub.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.digihub.dao.AppHeaderDAO;
import com.org.digihub.vo.DigiAppHeaderVO;

@Component
public class AppHeaderHelper {

	@Autowired
	AppHeaderDAO appHeaderDAO;
	
	public DigiAppHeaderVO getAppHeaderDetails(String userId, String companyId) {
		return appHeaderDAO.getAppHeaderDetails(userId, companyId);
	}
	
	public String saveAppHeaderDetails(DigiAppHeaderVO appHeaderDetailsObj) {
		return appHeaderDAO.saveAppHeaderDetails(appHeaderDetailsObj);
	}	
	
}
