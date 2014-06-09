package com.pms.mapper;

import java.util.List;

import com.pms.model.PasswordInfo;

/**
 * @author Jeniss 2014-4-25 下午2:42:35
 * @tags
 */
public interface IPasswordMapper{
	List<PasswordInfo> getAllPasswords();
	List<PasswordInfo> getSearchPasswords(String key);
	PasswordInfo getPasswordByID(int id);
	void createPassword(PasswordInfo passwordInfo);
	void deletePassword(int id);
	void modifyPassword(PasswordInfo passwordInfo);
	void deletePasswordByIds(int[] ids);
}
