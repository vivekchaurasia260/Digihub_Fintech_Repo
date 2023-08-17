package com.org.digihub.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.digihub.dao.ConfigQuestionDAO;
import com.org.digihub.repository.ConfigQuestionRepository;
import com.org.digihub.vo.DigiAppHeaderVO;
import com.org.digihub.vo.DigiConfigQuestionVO;

@Service
public class ConfigQuestionDAOImpl implements ConfigQuestionDAO {
	
	@Autowired
	ConfigQuestionRepository configQuestionRepository;
	
	@Override
	public DigiConfigQuestionVO getConfigQuestionDetails(String qId) {
		return configQuestionRepository.getConfigQuestionDetails(qId);
	}

	@Override
	public String saveConfigQuestionDetails(DigiConfigQuestionVO configQuestionDetailsObj) {
		String status = "{\"status\":\"success\"}";
		try {
			configQuestionRepository.save(configQuestionDetailsObj);
		} catch (Exception ex) {
			status = "{\"status\":\"error\"}";
		}
		return status;
	}
}
