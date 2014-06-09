package com.pms.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pms.model.PasswordInfo;

/**
 * @author Jeniss 2014-5-16 上午10:10:17
 * @tags
 */
@Repository("passwordMapper")
public class PasswordMapper extends BaseMapper implements IPasswordMapper {

	@Override
	public List<PasswordInfo> getAllPasswords() {
		return getSqlSession().selectList("com.pms.mapper.PasswordInfoMapper.getAllPasswords");
	}

	@Override
	public List<PasswordInfo> getSearchPasswords(String key) {
		return getSqlSession().selectList("com.pms.mapper.PasswordInfoMapper.getSearchPasswords", key);
	}

	@Override
	public PasswordInfo getPasswordByID(int id) {
		return getSqlSession().selectOne("com.pms.mapper.PasswordInfoMapper.getPasswordByID", id);
	}

	@Override
	public void createPassword(PasswordInfo passwordInfo) {
		getSqlSession().insert("com.pms.mapper.PasswordInfoMapper.createPassword", passwordInfo);
	}

	@Override
	public void deletePassword(int id) {
		getSqlSession().delete("com.pms.mapper.PasswordInfoMapper.deletePassword", id);
	}

	@Override
	public void modifyPassword(PasswordInfo passwordInfo) {
		getSqlSession().update("com.pms.mapper.PasswordInfoMapper.modifyPassword", passwordInfo);
	}

	@Override
	public void deletePasswordByIds(int[] ids) {
		getSqlSession().delete("com.pms.mapper.PasswordInfoMapper.deletePasswordByIds", ids);
	}

}
