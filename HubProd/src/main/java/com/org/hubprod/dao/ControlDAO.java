package com.org.hubprod.dao;

import java.util.List;

import com.org.hubprod.vo.HubProdControlVO;

public interface ControlDAO {
	
	public List<HubProdControlVO> getControlDetails(String userId, String appId, String sandBoxId);
	public String saveControlDetails(HubProdControlVO controlDetailsObj);
}
