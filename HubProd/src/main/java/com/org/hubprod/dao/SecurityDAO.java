package com.org.hubprod.dao;

import com.org.hubprod.vo.HubProdSecurityVO;

public interface SecurityDAO {
	
	public HubProdSecurityVO getSecurityDetails(String userId, String appId, String sandBoxId);
	public String saveSecurityDetails(HubProdSecurityVO securityDetailsObj);
}
