package com.org.digihub.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.digihub.dao.AppEmployeesDAO;
import com.org.digihub.repository.AppEmployeesRepository;
import com.org.digihub.vo.DigiAppEmployeesVO;

@Service
public class AppEmployeesDAOImpl implements AppEmployeesDAO {

	@Autowired
	AppEmployeesRepository appEmployeesRepository;

	@Override
	public DigiAppEmployeesVO getAppEmployeesDetails(String userId, String appId) {
		return appEmployeesRepository.getAppEmployeesDetails(userId, appId);
	}

	@Override
	public String saveAppEmployeesDetails(DigiAppEmployeesVO appEmployeesDetailsObj) {
		String status = "{\"status\":\"success\"}";
		try {
			appEmployeesRepository.save(appEmployeesDetailsObj);
		} catch (Exception ex) {
			status = "{\"status\":\"error\"}";
		}
		return status;
	}
	
	
	
}
