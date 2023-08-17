package com.org.hubprod.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.hubprod.vo.HubProdVO;

@Repository
public interface HubProdRepository extends CrudRepository<HubProdVO, String> {
	
	@Query("SELECT t FROM HubProdVO t where t.userId = ?1 and t.appId = ?2")
	public HubProdVO getHubProdDetails(String userId, String appId);
}
