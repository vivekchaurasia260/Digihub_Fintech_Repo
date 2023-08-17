package com.org.digihub.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.digihub.dao.AppCompanyDAO;
import com.org.digihub.repository.AppCompanyRepository;
import com.org.digihub.vo.DigiAppCompanyVO;

@Service
public class AppCompanyDAOImpl implements AppCompanyDAO{
	@Autowired
	AppCompanyRepository appCompanyRepository; 

	@Override
	public DigiAppCompanyVO getAppCompanyDetails(String userId, String companyId) {
		return appCompanyRepository.getAppCompanyDetails(userId, companyId);
	}

	@Override
	public String saveAppCompanyDetails(DigiAppCompanyVO appCompanyDetailsObj) {
		String status = "{\"status\":\"success\"}";
		try {
			appCompanyRepository.save(appCompanyDetailsObj);
		} catch (Exception ex) {
			status = "{\"status\":\"error\"}";
		}
		return status;
	}

	

}
