package com.org.hubprod.dao;

import java.util.List;

import com.org.hubprod.vo.HubSandboxApiTrailVO;

public interface SandboxApiTrailDAO {

	public List<HubSandboxApiTrailVO> getSandboxApiTrailDetails(String userId,String appId,String sandboxId ,String apiId);
	public String saveSandboxApiTrailDetails(HubSandboxApiTrailVO sandboxApiTrailObj);
}
