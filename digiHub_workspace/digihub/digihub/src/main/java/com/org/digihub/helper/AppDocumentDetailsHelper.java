package com.org.digihub.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.digihub.dao.AppDocumentDetailsDAO;
import com.org.digihub.vo.DigiAppDocumentDetailsVO;

@Component
public class AppDocumentDetailsHelper {
	
	@Autowired
	AppDocumentDetailsDAO appDocumentDetailsDAO;
	
	public DigiAppDocumentDetailsVO getAppDocumentDetails(String appId, String documentId)
	{
		return appDocumentDetailsDAO.getAppDocumentDetails(appId, documentId);
	}
	
	public String saveAppDocumentDetails(DigiAppDocumentDetailsVO appDocumentDetailsObj)
	{
		return appDocumentDetailsDAO.saveAppDocumentDetails(appDocumentDetailsObj);
	}
}
