package com.org.hubprod.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.hubprod.helper.SecurityHelper;
import com.org.hubprod.vo.HubProdSecurityVO;

@Component
public class SecurityDelegate {

	@Autowired
	SecurityHelper securityHelper;
	
	public HubProdSecurityVO getSecurityDetails(String userId, String appId, String sandBoxId)
	{
		return securityHelper.getSecurityDetails(userId, appId, sandBoxId);
	}
	
	public String saveSecurityDetails(HubProdSecurityVO securityDetailsObj)
	{
		
		return securityHelper.saveSecurityDetails(securityDetailsObj);
	}
}
