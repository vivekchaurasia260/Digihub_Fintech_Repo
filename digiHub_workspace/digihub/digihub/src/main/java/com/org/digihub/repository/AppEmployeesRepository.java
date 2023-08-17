package com.org.digihub.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.digihub.vo.DigiAppEmployeesVO;
import com.org.digihub.vo.DigiAppHeaderVO;

@Repository
public interface AppEmployeesRepository extends CrudRepository<DigiAppEmployeesVO, String>{

	@Query("SELECT t FROM DigiAppEmployeesVO t where t.userId = ?1 and t.appId = ?2")
	public DigiAppEmployeesVO getAppEmployeesDetails(String userId, String appId);
}
