package com.org.digihub.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.digihub.vo.DigiUserOpsVO;

@Repository
public interface UserOpsRepository extends CrudRepository<DigiUserOpsVO, String>{

	@Query("SELECT t FROM DigiUserOpsVO t where t.userId = ?1")
	public DigiUserOpsVO getUserOpsDetails(String userId);
}
