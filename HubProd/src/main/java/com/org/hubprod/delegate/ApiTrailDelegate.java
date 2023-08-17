package com.org.hubprod.delegate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.hubprod.helper.ApiTrailHelper;
import com.org.hubprod.vo.HubProdApiTrailVO;

@Component
public class ApiTrailDelegate {

	@Autowired
	ApiTrailHelper apiTrailHelper;
	
	
	public List<HubProdApiTrailVO> getApiTrailDetails(String userId, String appId, String sandBoxId, String apiId) {
		
		return apiTrailHelper.getApiTrailDetails(userId, appId, sandBoxId, apiId);
	}
	
	public String saveApiTrailDetails(HubProdApiTrailVO apiTrailDetailsObj) {
		
		return apiTrailHelper.saveApiTrailDetails(apiTrailDetailsObj);
	}	 
	
}
