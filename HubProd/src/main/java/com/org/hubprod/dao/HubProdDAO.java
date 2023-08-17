package com.org.hubprod.dao;

import com.org.hubprod.vo.HubProdVO;

public interface HubProdDAO {

	public HubProdVO getHubProdDetails(String userId, String appId);
	public String saveHubProdDetails(HubProdVO hubProdDetailsObj);
}
