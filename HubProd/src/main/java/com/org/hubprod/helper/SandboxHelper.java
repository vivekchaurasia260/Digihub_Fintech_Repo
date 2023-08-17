package com.org.hubprod.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.hubprod.dao.SandboxDAO;
import com.org.hubprod.vo.HubSandboxVO;

@Component
public class SandboxHelper {

	@Autowired
	SandboxDAO sandboxDAO;
	
	public HubSandboxVO getSandboxDetails(String userId,String appId ) {
		return sandboxDAO.getSandboxDetails(userId,appId);
	}
	
	public String saveSandboxDetails(HubSandboxVO sandboxDetailsObj) {
		return sandboxDAO.saveSandboxDetails(sandboxDetailsObj);
	}
}
