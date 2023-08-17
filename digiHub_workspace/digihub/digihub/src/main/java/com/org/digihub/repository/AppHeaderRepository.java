package com.org.digihub.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.digihub.vo.DigiAppHeaderVO;

@Repository
public interface AppHeaderRepository extends CrudRepository<DigiAppHeaderVO, String>{

	@Query("SELECT t FROM DigiAppHeaderVO t where t.userId = ?1 and t.companyId = ?2")
	public DigiAppHeaderVO getAppHeaderDetails(String userId, String companyId);
	
}
