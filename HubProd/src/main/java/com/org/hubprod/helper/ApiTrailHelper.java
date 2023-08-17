package com.org.hubprod.helper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.hubprod.dao.ApiTrailDAO;
import com.org.hubprod.vo.HubProdApiTrailVO;

@Component
public class ApiTrailHelper {

	@Autowired
	ApiTrailDAO apiTrailDAO;
	
	public List<HubProdApiTrailVO> getApiTrailDetails(String userId, String appId, String sandBoxId, String apiId) {
		
		return apiTrailDAO.getApiTrailDetails(userId, appId, sandBoxId, apiId);
	}
	
	public String saveApiTrailDetails(HubProdApiTrailVO apiTrailDetailsObj) {
		
		return apiTrailDAO.saveApiTrailDetails(apiTrailDetailsObj);
	}	 
}
