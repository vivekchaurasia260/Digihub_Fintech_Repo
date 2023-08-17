package com.org.hubprod.dao;

import com.org.hubprod.vo.HubSandboxSecurityVO;

public interface SandboxSecurityDAO {

	public HubSandboxSecurityVO getSandboxSecurityDetails(String userId,String appId,String sandboxId );
	public String saveSandboxSecurityDetails(HubSandboxSecurityVO sandboxSecurityObj);
}
