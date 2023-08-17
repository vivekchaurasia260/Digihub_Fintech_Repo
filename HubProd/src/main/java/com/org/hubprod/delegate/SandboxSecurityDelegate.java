package com.org.hubprod.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.hubprod.helper.SandboxSecurityHelper;
import com.org.hubprod.vo.HubSandboxSecurityVO;

@Component
public class SandboxSecurityDelegate {

	@Autowired
	SandboxSecurityHelper sandboxSecurityHelper;

	public HubSandboxSecurityVO getSandboxSecurityDetails(String userId,String appId,String sandboxId) {
		return sandboxSecurityHelper.getSandboxSecurityDetails(userId,appId,sandboxId);
	}
	
	public String saveSandboxSecurityDetails(HubSandboxSecurityVO securityDetailssObj) {
		return sandboxSecurityHelper.saveSandboxSecurityDetails(securityDetailssObj);
	}
}
