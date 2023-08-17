package com.org.digihub.dao;

import com.org.digihub.vo.DigiUserFintechVO;

public interface UserFintechDAO {
	
	public DigiUserFintechVO getUserFintechDetails(String userId);
	public String saveUserFintechDetails(DigiUserFintechVO userFintechDetailsObj);
	
}
