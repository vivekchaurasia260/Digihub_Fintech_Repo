package com.org.digihub.dao;

import com.org.digihub.vo.DigiAppDocumentDetailsVO;

public interface AppDocumentDetailsDAO {

	public DigiAppDocumentDetailsVO getAppDocumentDetails(String appId, String documentId);
	public String saveAppDocumentDetails(DigiAppDocumentDetailsVO appDocumentDetailsObj);
}
