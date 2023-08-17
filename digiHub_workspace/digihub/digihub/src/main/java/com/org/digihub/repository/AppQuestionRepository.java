package com.org.digihub.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.org.digihub.vo.DigiAppQuestionVO;

@Repository
public interface AppQuestionRepository extends CrudRepository<DigiAppQuestionVO, String>{


	@Query("SELECT t FROM DigiAppQuestionVO t where t.userId = ?1 and t.appId = ?2")
	public DigiAppQuestionVO getAppQuestionDetails(String userId, String appId);
}
