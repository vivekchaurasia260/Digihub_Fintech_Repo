package com.org.digihub.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.digihub.dao.UserFintechDAO;
import com.org.digihub.vo.DigiUserFintechVO;
@Component
public class UserFintechHelper {

	@Autowired
	UserFintechDAO userFintechDAO;
	
	public DigiUserFintechVO getUserFintechDetails(String userId) {
		return userFintechDAO.getUserFintechDetails(userId);
	}
	
	public String saveUserFintechDetails(DigiUserFintechVO userFintechDetailsObj) {
		return userFintechDAO.saveUserFintechDetails(userFintechDetailsObj);
	}	
}
