package com.org.hubprod.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.hubprod.helper.SandboxHelper;
import com.org.hubprod.vo.HubSandboxVO;

@Component
public class SandboxDelegate {

	@Autowired
	SandboxHelper sandboxHelper;

	public HubSandboxVO getSandboxetails(String userId,String appId) {
		return sandboxHelper.getSandboxDetails(userId,appId);
	}
	
	public String saveSandboxDetails(HubSandboxVO sandboxDetailssObj) {
		return sandboxHelper.saveSandboxDetails(sandboxDetailssObj);
	}
}
