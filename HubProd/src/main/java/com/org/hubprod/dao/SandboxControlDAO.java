package com.org.hubprod.dao;

import java.util.List;

import com.org.hubprod.vo.HubSandboxControlVO;

public interface SandboxControlDAO {

	public List<HubSandboxControlVO> getSandboxControlDetails(String userId,String appId,String sandboxId );
	public String saveSandboxControlDetails(HubSandboxControlVO sandboxControlObj);
}
