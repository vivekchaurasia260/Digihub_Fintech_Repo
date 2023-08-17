package com.org.digihub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.digihub.vo.DigiHelpDeskVO;

@Repository
public interface HelpDeskRepository extends CrudRepository<DigiHelpDeskVO, String>{
	@Query("SELECT t FROM DigiHelpDeskVO t where t.userId = ?1 and t.appId = ?2")
	public List<DigiHelpDeskVO> getHelpDeskDetails(String userId, String appid);

}
