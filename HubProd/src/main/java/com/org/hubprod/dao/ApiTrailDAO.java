package com.org.hubprod.dao;

import java.util.List;

import com.org.hubprod.vo.HubProdApiTrailVO;

public interface ApiTrailDAO {
	
	public List<HubProdApiTrailVO> getApiTrailDetails(String userId, String appId, String sandBoxId, String apiId);
	public String saveApiTrailDetails(HubProdApiTrailVO apiTrailDetailsObj);
}
