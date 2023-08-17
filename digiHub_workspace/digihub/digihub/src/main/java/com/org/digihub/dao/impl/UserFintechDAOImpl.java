package com.org.digihub.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.org.digihub.dao.UserFintechDAO;
import com.org.digihub.repository.UserFintechRepository;
import com.org.digihub.vo.DigiUserFintechVO;

@Service
public class UserFintechDAOImpl implements UserFintechDAO{

	@Autowired
	UserFintechRepository userFintechRepository; 

	@Override
	public DigiUserFintechVO getUserFintechDetails(String userId) {
		return userFintechRepository.getUserFintechDetails(userId);
	}

	@Override
	public String saveUserFintechDetails(DigiUserFintechVO userFintechDetailsObj) {
		String status = "{\"status\":\"success\"}";
		try {
			userFintechRepository.save(userFintechDetailsObj);
		} catch (Exception ex) {
			status = "{\"status\":\"error\"}";
		}
		return status;
	}
}
