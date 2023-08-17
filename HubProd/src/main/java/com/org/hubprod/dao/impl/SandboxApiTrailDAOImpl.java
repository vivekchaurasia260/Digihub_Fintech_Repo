package com.org.hubprod.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.hubprod.dao.SandboxApiTrailDAO;
import com.org.hubprod.repository.SandboxApiTrailRepository;
import com.org.hubprod.vo.HubSandboxApiTrailVO;

public class SandboxApiTrailDAOImpl implements SandboxApiTrailDAO{

	@Autowired
	SandboxApiTrailRepository sandboxApiTrailRepository; 

	@Override
	public List<HubSandboxApiTrailVO> getSandboxApiTrailDetails(String userId,String appId,String sandboxId,String apiId) {
		return sandboxApiTrailRepository.getSandboxApiTrailDetails(userId,appId,sandboxId,apiId);
		
	}

	@Override
	public String saveSandboxApiTrailDetails(HubSandboxApiTrailVO sandboxApiTrailObj) {
		String status = "{\"status\":\"success\"}";
		try {
			sandboxApiTrailRepository.save(sandboxApiTrailObj);
		} catch (Exception ex) {
			status = "{\"status\":\"error\"}";
		}
		return status;
	}
}
