package com.org.hubprod.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.hubprod.dao.SecurityDAO;
import com.org.hubprod.vo.HubProdSecurityVO;

@Component
public class SecurityHelper {

	@Autowired
	SecurityDAO securityDAO;
	
	public HubProdSecurityVO getSecurityDetails(String userId, String appId, String sandBoxId)
	{
		return securityDAO.getSecurityDetails(userId, appId, sandBoxId);
	}
	
	public String saveSecurityDetails(HubProdSecurityVO securityDetailsObj)
	{
		
		return securityDAO.saveSecurityDetails(securityDetailsObj);
	}
}
