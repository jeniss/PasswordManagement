package com.pms.service;

import java.util.List;

import com.pms.model.PasswordInfo;
import com.pms.model.PasswordName;

/**
 * @author Jeniss 2014-4-22 下午3:37:22
 * @tags 
 */
public interface PasswordInfoService {
	List<PasswordName> getAllPasswordInfosOrderByName();
	List<PasswordName> getSearchPasswordInfosOrderByName(String key);
	PasswordInfo getPasswordInfoByID(int id);
	void createPassworInfo(PasswordInfo passwordInfo);
	void deletePasswordInfoById(int id);
	void modifyPasswordInfo(PasswordInfo passwordInfo);
	void deletePasswordByIds(int[] ids);
}
