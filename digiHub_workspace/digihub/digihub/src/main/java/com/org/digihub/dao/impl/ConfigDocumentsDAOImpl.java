package com.org.digihub.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.digihub.dao.ConfigDocumentsDAO;
import com.org.digihub.repository.ConfigDocumentsRepository;
import com.org.digihub.vo.DigiConfigDocumentsVO;

@Service
public class ConfigDocumentsDAOImpl implements ConfigDocumentsDAO{
	@Autowired
	ConfigDocumentsRepository configDocumentsRepository; 

	@Override
	public DigiConfigDocumentsVO getConfigDocumentsDetails(String docId) {
		return configDocumentsRepository.getConfigDocumentsDetails(docId);
	}

	@Override
	public String saveConfigDocumentsDetails(DigiConfigDocumentsVO configDocumentsDetailsObj) {
		String status = "{\"status\":\"success\"}";
		try {
			configDocumentsRepository.save(configDocumentsDetailsObj);
		} catch (Exception ex) {
			status = "{\"status\":\"error\"}";
		}
		return status;
	}

}
