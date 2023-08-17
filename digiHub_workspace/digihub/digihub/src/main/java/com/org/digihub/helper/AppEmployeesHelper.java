package com.org.digihub.helper;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.digihub.dao.AppEmployeesDAO;
import com.org.digihub.vo.DigiAppEmployeesVO;
import com.org.digihub.vo.DigiAppHeaderVO;

public class AppEmployeesHelper {

	@Autowired
	AppEmployeesDAO appEmployeesDAO;
	
	public DigiAppEmployeesVO getAppEmployeesDetails(String userId, String appId) {
		return appEmployeesDAO.getAppEmployeesDetails(userId, appId);
	}
	
	public String saveAppEmployeesDetails(DigiAppEmployeesVO appEmployeesDetailsObj) {
		return appEmployeesDAO.saveAppEmployeesDetails(appEmployeesDetailsObj);
	}	
}
