package com.org.digihub.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.digihub.vo.DigiUserAdminVO;
@Repository
public interface UserAdminRepository  extends CrudRepository<DigiUserAdminVO, String>{
	
	@Query("SELECT t FROM DigiUserAdminVO t where t.userId = ?1 and t.firstName = ?2")
	public DigiUserAdminVO getUserAdminDetails(String userId, String firstName);

}
