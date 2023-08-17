package com.org.digihub.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.digihub.helper.AppDocumentDetailsHelper;
import com.org.digihub.vo.DigiAppDocumentDetailsVO;

@Component
public class AppDocumentDetailsDelegate {
	
	@Autowired
	AppDocumentDetailsHelper appDocumentDetailsHelper;
	
	public DigiAppDocumentDetailsVO getAppDocumentDetails(String appId, String documentId) {
		return appDocumentDetailsHelper.getAppDocumentDetails(appId, documentId);
	}
	
	public String saveAppDocumentDetails(DigiAppDocumentDetailsVO appDocumentDetailsObj) {
		return appDocumentDetailsHelper.saveAppDocumentDetails(appDocumentDetailsObj);
	}
}
