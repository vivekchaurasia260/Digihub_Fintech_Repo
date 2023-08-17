package com.org.digihub.dao;

import com.org.digihub.vo.DigiUserOpsVO;

public interface UserOpsDAO {
	
	public DigiUserOpsVO getUserOpsDetails(String userId);
	public String saveUserOpsDetails(DigiUserOpsVO userOpsDetailsObj);
}
