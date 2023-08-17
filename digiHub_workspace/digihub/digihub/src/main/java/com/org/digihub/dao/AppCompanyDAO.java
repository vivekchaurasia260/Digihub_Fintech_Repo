package com.org.digihub.dao;

import com.org.digihub.vo.DigiAppCompanyVO;

public interface AppCompanyDAO {
	public DigiAppCompanyVO getAppCompanyDetails(String docId, String seq);
	public String saveAppCompanyDetails(DigiAppCompanyVO appCompanyDetailsObj);

}
