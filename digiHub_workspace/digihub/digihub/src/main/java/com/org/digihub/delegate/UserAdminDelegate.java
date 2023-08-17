package com.org.digihub.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.digihub.helper.UserAdminHelper;
import com.org.digihub.vo.DigiUserAdminVO;

@Component
public class UserAdminDelegate {
	@Autowired
	UserAdminHelper userAdminHelper;

	public DigiUserAdminVO getUserAdminDetails(String userId, String firstName) {
		return userAdminHelper.getUserAdminDetails(userId, firstName);
	}
	
	public String saveUserAdminDetails(DigiUserAdminVO userAdminDetailsObj) {
		return userAdminHelper.saveUserAdminDetails(userAdminDetailsObj);
	}
}
