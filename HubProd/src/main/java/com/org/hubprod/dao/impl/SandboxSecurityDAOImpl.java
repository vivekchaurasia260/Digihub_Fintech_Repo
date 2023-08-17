package com.org.hubprod.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.hubprod.dao.SandboxSecurityDAO;
import com.org.hubprod.repository.SandboxSecurityRepository;
import com.org.hubprod.vo.HubSandboxSecurityVO;

public class SandboxSecurityDAOImpl implements SandboxSecurityDAO{
	
	@Autowired
	SandboxSecurityRepository sandboxSecurityRepository; 

	@Override
	public HubSandboxSecurityVO getSandboxSecurityDetails(String userId,String appId,String sandboxId) {
		return sandboxSecurityRepository.getSandboxSecurityDetails(userId,appId,sandboxId);
		
	}

	@Override
	public String saveSandboxSecurityDetails(HubSandboxSecurityVO sandboxSecurityObj) {
		String status = "{\"status\":\"success\"}";
		try {
			sandboxSecurityRepository.save(sandboxSecurityObj);
		} catch (Exception ex) {
			status = "{\"status\":\"error\"}";
		}
		return status;
	}


}
