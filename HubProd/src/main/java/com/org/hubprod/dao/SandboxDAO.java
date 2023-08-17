package com.org.hubprod.dao;

import com.org.hubprod.vo.HubSandboxVO;

public interface SandboxDAO {

	public HubSandboxVO getSandboxDetails(String userId,String appId );
	public String saveSandboxDetails(HubSandboxVO sandboxObj);
}
