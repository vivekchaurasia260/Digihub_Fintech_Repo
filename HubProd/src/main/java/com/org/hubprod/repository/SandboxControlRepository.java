package com.org.hubprod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.hubprod.vo.HubSandboxControlVO;

@Repository
public interface SandboxControlRepository extends CrudRepository<HubSandboxControlVO,String>{
	@Query("SELECT t FROM HubSandboxControlVO t where t.userId  = ?1 and t.appId=?2 and t.sandboxId=?3")
	public List<HubSandboxControlVO> getSandboxControlDetails(String userId,String appId,String sandboxId);
}
