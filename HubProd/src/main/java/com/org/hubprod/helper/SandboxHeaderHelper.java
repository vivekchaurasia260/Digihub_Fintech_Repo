package com.org.hubprod.helper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.hubprod.dao.SandboxHeaderDAO;
import com.org.hubprod.vo.HubSandboxHeaderVO;

@Component
public class SandboxHeaderHelper {

	@Autowired
	SandboxHeaderDAO sandboxHeaderDAO;
	
	public List<HubSandboxHeaderVO> getSandboxHeaderDetails(String userId,String appId,String sandboxId ) {
		return sandboxHeaderDAO.getSandboxHeaderDetails(userId,appId,sandboxId);
	}
	
	public String saveSandboxHeaderDetails(HubSandboxHeaderVO headerDetailsObj) {
		return sandboxHeaderDAO.saveSandboxHeaderDetails(headerDetailsObj);
	}
}
