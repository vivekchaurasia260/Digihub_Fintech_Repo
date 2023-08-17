package com.org.hubprod.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.hubprod.dao.ApiTrailDAO;
import com.org.hubprod.repository.ApiTrailRepository;
import com.org.hubprod.vo.HubProdApiTrailVO;

@Service
public class ApiTrailDAOImpl implements ApiTrailDAO {
	
	@Autowired
	ApiTrailRepository apiTrailRepository;

	@Override
	public List<HubProdApiTrailVO> getApiTrailDetails(String userId, String appId, String sandBoxId, String apiId) {
		
		return apiTrailRepository.getApiTrailDetails(userId, appId, sandBoxId, apiId);
	}

	@Override
	public String saveApiTrailDetails(HubProdApiTrailVO apiTrailDetailsObj) {
		String status = "{\"status\":\"success\"}";
		try {
			apiTrailRepository.save(apiTrailDetailsObj);
		} catch (Exception ex) {
			status = "{\"status\":\"error\"}";
		}
		return status;
	}

}
