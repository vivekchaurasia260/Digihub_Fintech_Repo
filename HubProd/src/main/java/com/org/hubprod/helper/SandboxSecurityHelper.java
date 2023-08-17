package com.org.hubprod.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.hubprod.dao.SandboxSecurityDAO;
import com.org.hubprod.vo.HubSandboxSecurityVO;

@Component
public class SandboxSecurityHelper {
	@Autowired
	SandboxSecurityDAO sandboxSecurityDAO;
	
	public HubSandboxSecurityVO getSandboxSecurityDetails(String userId,String appId,String sandboxId ) {
		return sandboxSecurityDAO.getSandboxSecurityDetails(userId,appId,sandboxId);
	}
	
	public String saveSandboxSecurityDetails(HubSandboxSecurityVO securityDetailsObj) {
		return sandboxSecurityDAO.saveSandboxSecurityDetails(securityDetailsObj);
	}
}
