package com.org.hubprod.dao;

import java.util.List;

import com.org.hubprod.vo.HubProdHeaderVO;

public interface HeaderDAO {

	public List<HubProdHeaderVO> getHeaderDetails(String userId, String appId, String sandBoxId);
	public String saveHeaderDetails(HubProdHeaderVO headerDetailsObj);
}
