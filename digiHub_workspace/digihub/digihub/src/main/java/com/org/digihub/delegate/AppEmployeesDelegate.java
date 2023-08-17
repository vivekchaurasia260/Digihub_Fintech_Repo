package com.org.digihub.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.digihub.helper.AppEmployeesHelper;
import com.org.digihub.vo.DigiAppEmployeesVO;

@Component
public class AppEmployeesDelegate {
	
	@Autowired
	AppEmployeesHelper appEmployeesHelper;
	
	public DigiAppEmployeesVO getAppEmployeesDetails(String userId, String appId) {
		return appEmployeesHelper.getAppEmployeesDetails(userId, appId);
	}
	
	public String saveAppEmployeesDetails(DigiAppEmployeesVO appEmployeesDetailsObj) {
		return appEmployeesHelper.saveAppEmployeesDetails(appEmployeesDetailsObj);
	}
}

