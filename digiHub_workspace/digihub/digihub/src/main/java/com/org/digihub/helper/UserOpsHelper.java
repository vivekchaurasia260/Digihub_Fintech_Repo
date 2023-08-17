package com.org.digihub.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.digihub.dao.UserOpsDAO;
import com.org.digihub.vo.DigiUserOpsVO;

@Component
public class UserOpsHelper {
	
	@Autowired
	UserOpsDAO userOpsDAO;
	
	public DigiUserOpsVO getUserOpsDetails(String userId) {
		return userOpsDAO.getUserOpsDetails(userId);
	}
	
	public String saveAppHeaderDetails(DigiUserOpsVO userOpsDetailsObj) {
		return userOpsDAO.saveUserOpsDetails(userOpsDetailsObj);
	}	
}