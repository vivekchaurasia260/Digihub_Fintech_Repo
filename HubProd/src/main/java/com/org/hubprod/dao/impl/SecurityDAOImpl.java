package com.org.hubprod.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.hubprod.dao.SecurityDAO;
import com.org.hubprod.repository.SecurityRepository;
import com.org.hubprod.vo.HubProdSecurityVO;

@Service
public class SecurityDAOImpl implements SecurityDAO {

	@Autowired
	SecurityRepository securityRepository;
	
	@Override
	public HubProdSecurityVO getSecurityDetails(String userId, String appId, String sandBoxId) {
		
		return securityRepository.getSecurityDetails(userId, appId, sandBoxId);
	}

	@Override
	public String saveSecurityDetails(HubProdSecurityVO securityDetailsObj) {
		String status = "{\"status\":\"success\"}";
		try {
			securityRepository.save(securityDetailsObj);
		} catch (Exception ex) {
			status = "{\"status\":\"error\"}";
		}
		return status;
	}

}
