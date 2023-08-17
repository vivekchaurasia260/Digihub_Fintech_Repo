package com.org.digihub.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.digihub.helper.UserOpsHelper;
import com.org.digihub.vo.DigiUserOpsVO;

@Component
public class UserOpsDelegate {

	@Autowired
	UserOpsHelper userOpsHelper;

	public DigiUserOpsVO getUserOpsDetails(String userId) {
		return userOpsHelper.getUserOpsDetails(userId);
	}
	
	public String saveUserOpsDetails(DigiUserOpsVO userOpsDetailsObj) {
		return userOpsHelper.saveAppHeaderDetails(userOpsDetailsObj);
	}
}
