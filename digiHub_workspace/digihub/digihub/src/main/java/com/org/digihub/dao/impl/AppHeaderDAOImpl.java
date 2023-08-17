package com.org.digihub.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.digihub.dao.AppHeaderDAO;
import com.org.digihub.repository.AppHeaderRepository;
import com.org.digihub.vo.DigiAppHeaderVO;

@Service
public class AppHeaderDAOImpl implements AppHeaderDAO{
	
	@Autowired
	AppHeaderRepository appHeaderRepository; 

	@Override
	public DigiAppHeaderVO getAppHeaderDetails(String userId, String companyId) {
		return appHeaderRepository.getAppHeaderDetails(userId, companyId);
	}

	@Override
	public String saveAppHeaderDetails(DigiAppHeaderVO appHeaderDetailsObj) {
		String status = "{\"status\":\"success\"}";
		try {
			appHeaderRepository.save(appHeaderDetailsObj);
		} catch (Exception ex) {
			status = "{\"status\":\"error\"}";
		}
		return status;
	}

}
