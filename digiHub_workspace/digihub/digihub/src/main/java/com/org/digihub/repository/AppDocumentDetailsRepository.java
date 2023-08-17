package com.org.digihub.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.digihub.vo.DigiAppDocumentDetailsVO;

@Repository
public interface AppDocumentDetailsRepository extends CrudRepository<DigiAppDocumentDetailsVO, String>{
	
	@Query("SELECT t FROM DigiAppDocumentDetailsVO t where t.appId = ?1 and t.documentId = ?2")
	public DigiAppDocumentDetailsVO getAppDocumentDetails(String appId, String documentId);
}
