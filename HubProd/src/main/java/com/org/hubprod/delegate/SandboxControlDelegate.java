package com.org.hubprod.delegate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.hubprod.helper.SandboxControlHelper;
import com.org.hubprod.vo.HubSandboxControlVO;

@Component
public class SandboxControlDelegate {

	@Autowired
	SandboxControlHelper sandboxControlHelper;

	public List<HubSandboxControlVO> getSandboxControlDetails(String userId,String appId,String sandboxId) {
		return sandboxControlHelper.getSandboxControlDetails(userId,appId,sandboxId);
	}
	
	public String saveSandboxControlDetails(HubSandboxControlVO controlDetailssObj) {
		return sandboxControlHelper.saveSandboxControlDetails(controlDetailssObj);
	}
}
