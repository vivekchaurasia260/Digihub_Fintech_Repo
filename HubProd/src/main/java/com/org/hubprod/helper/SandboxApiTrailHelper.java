package com.org.hubprod.helper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.hubprod.dao.SandboxApiTrailDAO;
import com.org.hubprod.vo.HubSandboxApiTrailVO;

@Component 
public class SandboxApiTrailHelper {
	@Autowired
	SandboxApiTrailDAO sandboxApiTrailDAO;
	
	public List<HubSandboxApiTrailVO> getSandboxApiTrailDetails(String userId,String appId,String sandboxId ,String apiId) {
		return sandboxApiTrailDAO.getSandboxApiTrailDetails(userId,appId,sandboxId,apiId);
	}
	
	public String saveSandboxApiTrailDetails(HubSandboxApiTrailVO apiTrailDetailsObj) {
		return sandboxApiTrailDAO.saveSandboxApiTrailDetails(apiTrailDetailsObj);
	}	

}
