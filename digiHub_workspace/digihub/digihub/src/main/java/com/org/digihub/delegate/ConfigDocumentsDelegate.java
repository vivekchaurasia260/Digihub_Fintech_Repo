package com.org.digihub.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.digihub.helper.ConfigDocumentsHelper;
import com.org.digihub.vo.DigiConfigDocumentsVO;

@Component

public class ConfigDocumentsDelegate {
	@Autowired
	ConfigDocumentsHelper configDocumentsHelper;

	public DigiConfigDocumentsVO getConfigDocumentsDetails(String docId) {
		return configDocumentsHelper.getConfigDocumentsDetails(docId);
	}
	
	public String saveConfigDocumentsDetails(DigiConfigDocumentsVO configDocumentsDetailsObj) {
		return configDocumentsHelper.saveConfigDocumentsDetails(configDocumentsDetailsObj);
	}
}
