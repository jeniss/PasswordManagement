package com.pms.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pms.mapper.IPasswordMapper;
import com.pms.model.PasswordInfo;
import com.pms.model.PasswordName;

/**
 * @author Jeniss 2014-4-22 下午3:37:30
 * @tags 
 */
@Service(value="passwordInfoService")
public class PasswordInfoServiceImpl implements PasswordInfoService {
	@Resource(name="passwordMapper")
	private IPasswordMapper passwordMapper;

	@Override
	public List<PasswordName> getAllPasswordInfosOrderByName() {
//		List<PasswordInfo> passwordInfos = passwordMapper.getSearchPasswords(null);
		List<PasswordInfo> passwordInfos = passwordMapper.getAllPasswords();
		return passwordInfoOrderByName(passwordInfos);
	}

	@Override
	public List<PasswordName> getSearchPasswordInfosOrderByName(String key) {
		List<PasswordInfo> passwordInfos = passwordMapper.getSearchPasswords(key);
		return passwordInfoOrderByName(passwordInfos);
	}

	@Override
	public PasswordInfo getPasswordInfoByID(int id) {
		return passwordMapper.getPasswordByID(id);
	}

	@Override
	public void createPassworInfo(PasswordInfo passwordInfo) {
		passwordMapper.createPassword(passwordInfo);
	}

	@Override
	public void deletePasswordInfoById(int id) {
		passwordMapper.deletePassword(id);
	}

	@Override
	public void modifyPasswordInfo(PasswordInfo passwordInfo) {
		passwordMapper.modifyPassword(passwordInfo);
	}

	@Override
	public void deletePasswordByIds(int[] ids) {
		passwordMapper.deletePasswordByIds(ids);
	}
	
	private List<PasswordName> passwordInfoOrderByName(List<PasswordInfo> passwordInfos) {
		List<PasswordName> passwordInfosOrderByName = new ArrayList<PasswordName>();
		if (passwordInfos.size() > 0) {
			String old_name = passwordInfos.get(0).getName();
			List<PasswordInfo> passwordInfoList = new ArrayList<PasswordInfo>();
			for (int i = 0; i < passwordInfos.size(); i++) {
				PasswordInfo passwordInfo = passwordInfos.get(i);
				if (!old_name.equals(passwordInfo.getName())) {
					PasswordName passwordName = new PasswordName();
					passwordName.setName(old_name);
					passwordName.setPasswordInfos(passwordInfoList);
					passwordInfosOrderByName.add(passwordName);
					old_name = passwordInfo.getName();
					passwordInfoList = new ArrayList<PasswordInfo>();
					passwordInfoList.add(passwordInfo);
				} else {
					passwordInfoList.add(passwordInfo);
				}
			}
			if (passwordInfoList.size() > 0) {
				PasswordName passwordName = new PasswordName();
				passwordName.setName(old_name);
				passwordName.setPasswordInfos(passwordInfoList);
				passwordInfosOrderByName.add(passwordName);
			}
		}
		return passwordInfosOrderByName;
	}
}
