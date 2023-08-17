package com.org.digihub.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.digihub.dao.AppCompanyDAO;
import com.org.digihub.vo.DigiAppCompanyVO;
@Component
public class AppCompanyHelper {
	@Autowired
	AppCompanyDAO appCompanyDAO;
	
	public DigiAppCompanyVO getAppCompanyDetails(String userId, String companyId) {
		return appCompanyDAO.getAppCompanyDetails(userId, companyId);
	}
	
	public String saveAppCompanyDetails(DigiAppCompanyVO appCompanyDetailsObj) {
		return appCompanyDAO.saveAppCompanyDetails(appCompanyDetailsObj);
	}	
}
