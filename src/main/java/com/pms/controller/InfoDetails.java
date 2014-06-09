package com.pms.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pms.model.PasswordInfo;

/*
 *@author Jeniss 2013-12-8 ÉÏÎç11:35:35
 *@tags
 */
@Controller
public class InfoDetails extends BaseAction {

	@RequestMapping(value = "/infoDetails")
	@ResponseBody
	public Map<String, Object> passwordInfoDetails(@RequestParam int id, HttpServletResponse response) {
		PasswordInfo passwordInfo = passwordInfoService.getPasswordInfoByID(id);
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("name", passwordInfo);
		return modelMap;
	}
}
