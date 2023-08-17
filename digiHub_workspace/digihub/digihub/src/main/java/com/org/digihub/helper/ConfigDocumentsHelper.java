package com.org.digihub.helper;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.digihub.dao.ConfigDocumentsDAO;
import com.org.digihub.vo.DigiConfigDocumentsVO;

public class ConfigDocumentsHelper {
	@Autowired
	ConfigDocumentsDAO configDocumentsDAO;
	
	public DigiConfigDocumentsVO getConfigDocumentsDetails(String docId) {
		return configDocumentsDAO.getConfigDocumentsDetails(docId);
	}
	
	public String saveConfigDocumentsDetails(DigiConfigDocumentsVO configDocumentsDetailsObj) {
		return configDocumentsDAO.saveConfigDocumentsDetails(configDocumentsDetailsObj);
	}	
}
