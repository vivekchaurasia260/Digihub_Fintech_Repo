package com.org.digihub.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.digihub.dao.UserAdminDAO;
import com.org.digihub.repository.UserAdminRepository;
import com.org.digihub.vo.DigiUserAdminVO;
@Service
public class UserAdminDAOImpl implements UserAdminDAO{
	@Autowired
	UserAdminRepository userAdminRepository; 

	@Override
	public DigiUserAdminVO getUserAdminDetails(String userId, String firstName) {
		return userAdminRepository.getUserAdminDetails(userId, firstName);
	}

	@Override
	public String saveUserAdminDetails(DigiUserAdminVO userAdminDetailsObj) {
		String status = "{\"status\":\"success\"}";
		try {
			userAdminRepository.save(userAdminDetailsObj);
		} catch (Exception ex) {
			status = "{\"status\":\"error\"}";
		}
		return status;
	}

}
