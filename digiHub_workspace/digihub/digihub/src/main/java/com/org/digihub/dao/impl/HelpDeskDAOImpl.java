package com.org.digihub.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.digihub.dao.HelpDeskDAO;
import com.org.digihub.repository.HelpDeskRepository;
import com.org.digihub.vo.DigiHelpDeskVO;

@Service
public class HelpDeskDAOImpl implements  HelpDeskDAO{
	@Autowired
	HelpDeskRepository helpDeskRepository;

	@Override
	public List<DigiHelpDeskVO> getHelpDeskDetails(String userId, String appId) {
		return helpDeskRepository.getHelpDeskDetails(userId, appId);
	}
	@Override
	public String saveHelpDeskDetails(DigiHelpDeskVO helpDeskDetailsObj) {
		String status = "{\"status\":\"success\"}";
		try {
			helpDeskRepository.save(helpDeskDetailsObj);
		} catch (Exception ex) {
			status = "{\"status\":\"error\"}";
		}
		return status;
	}


}
