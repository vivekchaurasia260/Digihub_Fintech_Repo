package com.org.digihub.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.digihub.vo.DigiAppCompanyVO;
@Repository
public interface AppCompanyRepository extends CrudRepository<DigiAppCompanyVO, String>{
	
	@Query("SELECT t FROM DigiAppCompanyVO t where t.userId = ?1 and t.companyId = ?2")
	public DigiAppCompanyVO getAppCompanyDetails(String userId, String companyId);

}

