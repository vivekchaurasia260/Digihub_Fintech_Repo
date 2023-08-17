package com.org.hubprod.helper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.hubprod.dao.HeaderDAO;
import com.org.hubprod.vo.HubProdHeaderVO;

@Component
public class HeaderHelper {

	@Autowired
	HeaderDAO headerDAO;
	
	public List<HubProdHeaderVO> getHeaderDetails(String userId, String appId, String sandBoxId)
	{
		return headerDAO.getHeaderDetails(userId, appId, sandBoxId);
	}
	
	public String saveHeaderDetails(HubProdHeaderVO headerDetailsObj)
	{
		return headerDAO.saveHeaderDetails(headerDetailsObj);
	}
}
