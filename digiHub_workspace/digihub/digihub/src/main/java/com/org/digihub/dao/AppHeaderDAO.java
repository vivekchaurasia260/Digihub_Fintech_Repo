package com.org.digihub.dao;

import com.org.digihub.vo.DigiAppHeaderVO;

public interface AppHeaderDAO {

	public DigiAppHeaderVO getAppHeaderDetails(String userId, String companyId);
	public String saveAppHeaderDetails(DigiAppHeaderVO appHeaderDetailsObj);
}
