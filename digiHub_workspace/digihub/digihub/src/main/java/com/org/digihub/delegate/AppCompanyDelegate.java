package com.org.digihub.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.digihub.helper.AppCompanyHelper;
import com.org.digihub.vo.DigiAppCompanyVO;

@Component
public class AppCompanyDelegate {
	@Autowired
	AppCompanyHelper appCompanyHelper;

	public DigiAppCompanyVO getAppCompanyDetails(String userId, String companyId) {
		return appCompanyHelper.getAppCompanyDetails(userId, companyId);
	}
	
	public String saveAppCompanyDetails(DigiAppCompanyVO appCompanyDetailsObj) {
		return appCompanyHelper.saveAppCompanyDetails(appCompanyDetailsObj);
	}
}
