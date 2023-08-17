package com.org.digihub.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.digihub.dao.UserOpsDAO;
import com.org.digihub.repository.UserOpsRepository;
import com.org.digihub.vo.DigiUserOpsVO;

@Service
public class UserOpsDAOImpl implements UserOpsDAO{
	
	@Autowired
	UserOpsRepository userOpsRepository;

	@Override
	public DigiUserOpsVO getUserOpsDetails(String userId) {
		return userOpsRepository.getUserOpsDetails(userId);
	}

	@Override
	public String saveUserOpsDetails(DigiUserOpsVO userOpsDetailsObj) {
		String status = "{\"status\":\"success\"}";
		try {
			userOpsRepository.save(userOpsDetailsObj);
		} catch (Exception ex) {
			status = "{\"status\":\"error\"}";
		}
		return status;
	}

}
