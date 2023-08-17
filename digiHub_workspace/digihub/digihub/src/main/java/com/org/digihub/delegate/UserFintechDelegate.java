package com.org.digihub.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.digihub.helper.UserFintechHelper;
import com.org.digihub.vo.DigiUserFintechVO;
@Component
public class UserFintechDelegate {


	@Autowired
	UserFintechHelper userFintechHelper;

	public DigiUserFintechVO getUserFintechDetails(String userId) {
		return userFintechHelper.getUserFintechDetails(userId);
	}
	
	public String saveUserFintechDetails(DigiUserFintechVO userFintechDetailsObj) {
		return userFintechHelper.saveUserFintechDetails(userFintechDetailsObj);
	}
}
