package com.org.hubprod.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.hubprod.dao.SandboxHeaderDAO;
import com.org.hubprod.repository.SandboxHeaderRepository;
import com.org.hubprod.vo.HubSandboxHeaderVO;

public class SandboxHeaderDAOImpl implements SandboxHeaderDAO{

	@Autowired
	SandboxHeaderRepository sandboxHeaderRepository; 

	@Override
	public List<HubSandboxHeaderVO> getSandboxHeaderDetails(String userId,String appId,String sandboxId) {
		return sandboxHeaderRepository.getSandboxHeaderDetails(userId,appId,sandboxId);
		
	}

	@Override
	public String saveSandboxHeaderDetails(HubSandboxHeaderVO sandboxHeaderObj) {
		String status = "{\"status\":\"success\"}";
		try {
			sandboxHeaderRepository.save(sandboxHeaderObj);
		} catch (Exception ex) {
			status = "{\"status\":\"error\"}";
		}
		return status;
	}

}
