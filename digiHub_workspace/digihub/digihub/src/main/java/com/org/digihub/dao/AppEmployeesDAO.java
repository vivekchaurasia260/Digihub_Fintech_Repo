package com.org.digihub.dao;

import com.org.digihub.vo.DigiAppEmployeesVO;

public interface AppEmployeesDAO {
	
	public DigiAppEmployeesVO getAppEmployeesDetails(String userId, String appId);
	public String saveAppEmployeesDetails(DigiAppEmployeesVO AppEmployeesDetailsObj);
}
