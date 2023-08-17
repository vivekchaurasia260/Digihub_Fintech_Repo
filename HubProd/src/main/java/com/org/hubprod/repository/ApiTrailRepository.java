package com.org.hubprod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.hubprod.vo.HubProdApiTrailVO;

@Repository
public interface ApiTrailRepository extends CrudRepository<HubProdApiTrailVO, String> {

	@Query("SELECT t FROM HubProdApiTrailVO t where t.userId = ?1 and t.appId = ?2 and t.sandboxId = ?3 and t.apiId = ?4")
	public List<HubProdApiTrailVO> getApiTrailDetails(String userId, String appId, String sandBoxId, String apiId);
}
