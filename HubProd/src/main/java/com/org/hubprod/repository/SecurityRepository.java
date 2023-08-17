package com.org.hubprod.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.hubprod.vo.HubProdSecurityVO;

@Repository
public interface SecurityRepository extends CrudRepository<HubProdSecurityVO, String> {
	
	@Query("SELECT t FROM HubProdSecurityVO t where t.userId = ?1 and t.appId = ?2 and t.sandboxId = ?3")
	public HubProdSecurityVO getSecurityDetails(String userId, String appId, String sandBoxId);
}
