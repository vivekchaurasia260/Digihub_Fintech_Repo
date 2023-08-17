package com.org.hubprod.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.hubprod.dao.HeaderDAO;
import com.org.hubprod.repository.HeaderRepository;
import com.org.hubprod.vo.HubProdHeaderVO;

@Service
public class HeaderDAOImpl implements HeaderDAO{
	
	@Autowired
	HeaderRepository headerRepository;

	@Override
	public List<HubProdHeaderVO> getHeaderDetails(String userId, String appId, String sandBoxId) {
		
		return headerRepository.getHeaderDetails(userId, appId, sandBoxId);
	}

	@Override
	public String saveHeaderDetails(HubProdHeaderVO headerDetailsObj) {
		
		String status = "{\"status\":\"success\"}";
		try {
			headerRepository.save(headerDetailsObj);
		} catch (Exception ex) {
			status = "{\"status\":\"error\"}";
		}
		return status;
	}

}
