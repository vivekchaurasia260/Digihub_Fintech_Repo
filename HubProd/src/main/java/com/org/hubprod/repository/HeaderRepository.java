package com.org.hubprod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.hubprod.vo.HubProdHeaderVO;

@Repository
public interface HeaderRepository extends CrudRepository<HubProdHeaderVO, String>{
	
	@Query("SELECT t FROM HubProdHeaderVO t where t.userId = ?1 and t.appId = ?2 and t.sandboxId = ?3")
	public List<HubProdHeaderVO> getHeaderDetails(String userId, String appId, String sandBoxId);
}
