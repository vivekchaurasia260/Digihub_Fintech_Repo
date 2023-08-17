package com.org.hubprod.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.hubprod.vo.HubSandboxVO;


@Repository
public interface SandboxRepository extends CrudRepository<HubSandboxVO,String>{
	@Query("SELECT t FROM HubSandboxVO t where t.userId  = ?1 and t.appId=?2 ")
	public HubSandboxVO getSandboxDetails(String userId,String appId);

}
