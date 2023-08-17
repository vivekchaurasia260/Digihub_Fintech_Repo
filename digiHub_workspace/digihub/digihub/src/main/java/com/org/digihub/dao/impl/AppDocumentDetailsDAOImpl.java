package com.org.digihub.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.digihub.dao.AppDocumentDetailsDAO;
import com.org.digihub.repository.AppDocumentDetailsRepository;
import com.org.digihub.vo.DigiAppDocumentDetailsVO;

@Service
public class AppDocumentDetailsDAOImpl implements AppDocumentDetailsDAO {
	
	@Autowired
	AppDocumentDetailsRepository appDocumentDetailsRepository;

	@Override
	public DigiAppDocumentDetailsVO getAppDocumentDetails(String appId, String documentId) {
		return appDocumentDetailsRepository.getAppDocumentDetails(appId, documentId);
	}

	@Override
	public String saveAppDocumentDetails(DigiAppDocumentDetailsVO appDocumentDetailsObj) {
		String status = "{\"status\":\"success\"}";
		try {
			appDocumentDetailsRepository.save(appDocumentDetailsObj);
		} catch (Exception ex) {
			status = "{\"status\":\"error\"}";
		}
		return status;
	}

}
