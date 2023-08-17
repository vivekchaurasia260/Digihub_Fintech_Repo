package com.org.hubprod.delegate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.hubprod.helper.SandboxHeaderHelper;
import com.org.hubprod.vo.HubSandboxHeaderVO;

@Component
public class SandboxHeaderDelegate {

	@Autowired
	SandboxHeaderHelper sandboxHeaderHelper;

	public List<HubSandboxHeaderVO> getSandboxHeaderDetails(String userId,String appId,String sandboxId) {
		return sandboxHeaderHelper.getSandboxHeaderDetails(userId,appId,sandboxId);
	}
	
	public String saveSandboxHeaderDetails(HubSandboxHeaderVO headerDetailssObj) {
		return sandboxHeaderHelper.saveSandboxHeaderDetails(headerDetailssObj);
	}
}
