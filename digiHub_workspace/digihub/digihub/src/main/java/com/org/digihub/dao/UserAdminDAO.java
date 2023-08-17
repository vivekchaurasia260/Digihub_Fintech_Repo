package com.org.digihub.dao;

import com.org.digihub.vo.DigiUserAdminVO;

public interface UserAdminDAO {
	public DigiUserAdminVO getUserAdminDetails(String userId, String firstName);
	public String saveUserAdminDetails(DigiUserAdminVO userAdminDetailsObj);

}
