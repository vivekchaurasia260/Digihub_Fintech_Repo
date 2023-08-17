package com.org.digihub.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.digihub.vo.DigiConfigQuestionVO;

@Repository
public interface ConfigQuestionRepository extends CrudRepository<DigiConfigQuestionVO, String>{
	
	@Query("SELECT t FROM DigiConfigQuestionVO t where t.qId = ?1 and t.sectionId = ?2")
	public DigiConfigQuestionVO getConfigQuestionDetails(String qId);
}
