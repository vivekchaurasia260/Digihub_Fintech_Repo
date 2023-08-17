package com.org.hubprod.delegate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.hubprod.helper.SandboxApiTrailHelper;
import com.org.hubprod.vo.HubSandboxApiTrailVO;

@Component
public class SandboxApiTrailDelegate {

	@Autowired
	SandboxApiTrailHelper sandboxApiTrailHelper;

	public List<HubSandboxApiTrailVO> getSandboxApiTrailDetails(String userId,String appId,String sandboxId ,String apiId) {
		return sandboxApiTrailHelper.getSandboxApiTrailDetails(userId,appId,sandboxId,apiId);
	}
	
	public String saveSandboxApiTrailDetails(HubSandboxApiTrailVO apiTrailDetailssObj) {
		return sandboxApiTrailHelper.saveSandboxApiTrailDetails(apiTrailDetailssObj);
	}
}
