package com.org.hubprod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.hubprod.vo.HubSandboxHeaderVO;

@Repository
public interface SandboxHeaderRepository extends CrudRepository<HubSandboxHeaderVO,String>{
	@Query("SELECT t FROM HubSandboxHeaderVO t where t.userId  = ?1 and t.appId=?2 and t.sandboxId=?3  ")
	public List<HubSandboxHeaderVO> getSandboxHeaderDetails(String userId,String appId,String sandboxId);

}
