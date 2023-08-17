package com.org.digihub.helper;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.digihub.dao.UserAdminDAO;
import com.org.digihub.vo.DigiUserAdminVO;

public class UserAdminHelper {
	@Autowired
	UserAdminDAO userAdminDAO;
	
	public DigiUserAdminVO getUserAdminDetails(String userId, String firstName) {
		return userAdminDAO.getUserAdminDetails(userId, firstName);
	}
	
	public String saveUserAdminDetails(DigiUserAdminVO userFintechDetailsObj) {
		return userAdminDAO.saveUserAdminDetails(userFintechDetailsObj);
	}	
}
