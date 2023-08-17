package com.org.digihub.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.org.digihub.vo.DigiConfigDocumentsVO;

@Repository
public interface ConfigDocumentsRepository extends CrudRepository<DigiConfigDocumentsVO, String>{


	@Query("SELECT t FROM DigiConfigDocumentsVO t where t.docId = ?1")
	public DigiConfigDocumentsVO getConfigDocumentsDetails(String docId);
}
