package com.pms.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pms.model.PasswordInfo;


/*
 *@author Jeniss 2013-12-10 ÏÂÎç3:15:34
 *@tags
 */
@Controller
public class UpdatePasswordInfo extends BaseAction {
	@RequestMapping(value = "/modifyPasswordInfo", produces = "text/plain;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> modifyPasswordInfo(PasswordInfo passwordInfo, HttpServletRequest request) {
		if (passwordInfo != null) {
			passwordInfoService.modifyPasswordInfo(passwordInfo);
			System.out.println("ok");
			return new HashMap<String, Object>();
		}
		return null;
	}
}
