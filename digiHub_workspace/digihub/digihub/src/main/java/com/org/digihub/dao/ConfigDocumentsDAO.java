package com.org.digihub.dao;

import com.org.digihub.vo.DigiConfigDocumentsVO;

public interface ConfigDocumentsDAO {

	public DigiConfigDocumentsVO getConfigDocumentsDetails(String docId);
	public String saveConfigDocumentsDetails(DigiConfigDocumentsVO configDocumentsDetailsObj);
}

