package com.org.hubprod.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.hubprod.dao.SandboxControlDAO;
import com.org.hubprod.repository.SandboxControlRepository;
import com.org.hubprod.vo.HubSandboxControlVO;

public class SandboxControlDAOImpl implements SandboxControlDAO{
	
	@Autowired
	SandboxControlRepository sandboxControlRepository; 

	@Override
	public List<HubSandboxControlVO> getSandboxControlDetails(String userId,String appId,String sandboxId) {
		return sandboxControlRepository.getSandboxControlDetails(userId,appId,sandboxId);
		
	}

	@Override
	public String saveSandboxControlDetails(HubSandboxControlVO sandboxControlObj) {
		String status = "{\"status\":\"success\"}";
		try {
			sandboxControlRepository.save(sandboxControlObj);
		} catch (Exception ex) {
			status = "{\"status\":\"error\"}";
		}
		return status;
	}

}
