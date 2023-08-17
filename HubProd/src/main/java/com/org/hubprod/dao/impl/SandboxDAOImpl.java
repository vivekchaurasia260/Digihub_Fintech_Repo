package com.org.hubprod.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.hubprod.dao.SandboxDAO;
import com.org.hubprod.repository.SandboxRepository;
import com.org.hubprod.vo.HubSandboxVO;

public class SandboxDAOImpl implements SandboxDAO {

	@Autowired
	SandboxRepository sandboxRepository; 

	@Override
	public HubSandboxVO getSandboxDetails(String userId,String appId) {
		return sandboxRepository.getSandboxDetails(userId,appId);
		
	}

	@Override
	public String saveSandboxDetails(HubSandboxVO sandboxObj) {
		String status = "{\"status\":\"success\"}";
		try {
			sandboxRepository.save(sandboxObj);
		} catch (Exception ex) {
			status = "{\"status\":\"error\"}";
		}
		return status;
	}
}
