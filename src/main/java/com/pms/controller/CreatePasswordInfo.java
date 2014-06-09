package com.pms.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pms.model.PasswordInfo;

/*
 *@author Jeniss 2013-12-7 ÏÂÎç8:28:07
 *@tags
 */
@Controller
public class CreatePasswordInfo extends BaseAction {
	@RequestMapping(value = "/createPasswordInfo")
	@ResponseBody
	public Map<String, Object> createPasswordInfo(PasswordInfo passwordInfo, HttpServletRequest request) {
		if (pre_createPIIsNotBlank(passwordInfo)) {
				PasswordInfo newPasswordInfo = new PasswordInfo();
				newPasswordInfo.setName(passwordInfo.getName());
				newPasswordInfo.setUsername(passwordInfo.getUsername());
				newPasswordInfo.setPassword(passwordInfo.getPassword());
				newPasswordInfo.setUrl(passwordInfo.getUrl());
				newPasswordInfo.setInfo(passwordInfo.getInfo());

				passwordInfoService.createPassworInfo(newPasswordInfo);
				return new HashMap<>();
			}
		return null;
	}

	private boolean pre_createPIIsNotBlank(final PasswordInfo passwordInfo) {
		if (StringUtils.isNotBlank(passwordInfo.getName())
				&& StringUtils.isNotBlank(passwordInfo.getPassword())
				&& StringUtils.isNotBlank(passwordInfo.getInfo())
				&& StringUtils.isNotBlank(passwordInfo.getUrl())
				&& StringUtils.isNotBlank(passwordInfo.getUsername()))
			return true;
		return false;
	}
}
