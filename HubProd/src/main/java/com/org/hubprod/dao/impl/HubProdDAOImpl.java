package com.org.hubprod.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.hubprod.dao.HubProdDAO;
import com.org.hubprod.repository.HubProdRepository;
import com.org.hubprod.vo.HubProdVO;

@Service
public class HubProdDAOImpl implements HubProdDAO{

	@Autowired
	HubProdRepository hubProdRepository;
	
	@Override
	public HubProdVO getHubProdDetails(String userId, String appId) {
		
		return hubProdRepository.getHubProdDetails(userId, appId);
	}

	@Override
	public String saveHubProdDetails(HubProdVO hubProdDetailsObj) {
		String status = "{\"status\":\"success\"}";
		try {
			hubProdRepository.save(hubProdDetailsObj);
		} catch (Exception ex) {
			status = "{\"status\":\"error\"}";
		}
		return status;
	}

}
