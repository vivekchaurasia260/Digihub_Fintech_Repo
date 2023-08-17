package com.org.hubprod.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.hubprod.helper.HubProdHelper;
import com.org.hubprod.vo.HubProdVO;

@Component
public class HubProdDelegate {
	
	@Autowired
	HubProdHelper hubProdHelper;
	
	public HubProdVO getHubProdDetails(String userId, String appId)
	{
		return hubProdHelper.getHubProdDetails(userId, appId);
	}
	
	
	public String saveHubProdDetails(HubProdVO hubProdDetailsObj)
	{
		
		return hubProdHelper.saveHubProdDetails(hubProdDetailsObj);
	}
}
