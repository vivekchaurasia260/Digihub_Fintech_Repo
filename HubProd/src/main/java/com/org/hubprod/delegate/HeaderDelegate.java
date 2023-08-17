package com.org.hubprod.delegate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.hubprod.helper.HeaderHelper;
import com.org.hubprod.vo.HubProdHeaderVO;

@Component
public class HeaderDelegate {

	@Autowired
	HeaderHelper headerHelper;
	
	public List<HubProdHeaderVO> getHeaderDetails(String userId, String appId, String sandBoxId)
	{
		return headerHelper.getHeaderDetails(userId, appId, sandBoxId);
	}
	
	public String saveHeaderDetails(HubProdHeaderVO headerDetailsObj)
	{
		return headerHelper.saveHeaderDetails(headerDetailsObj);
	}
}
