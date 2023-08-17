package com.org.digihub.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.org.digihub.vo.DigiUserFintechVO;

@Repository
public interface UserFintechRepository extends CrudRepository<DigiUserFintechVO, String>{
	@Query("SELECT t FROM DigiUserFintechVO t where t.userId = ?1")
	public DigiUserFintechVO getUserFintechDetails(String userId);

}
