package com.pms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 *@author Jeniss 2013-12-9 ÏÂÎç11:48:31
 *@tags
 */
@Controller
public class DeletePasswordInfo extends BaseAction{
	@RequestMapping("/deletePasswordInfo")
	@ResponseBody
	public Map<String, Object> deletePasswordInfo(String id) {
		if (!"".equals(id) || id != null) {
			int newID = Integer.valueOf(id);
			passwordInfoService.deletePasswordInfoById(newID);
			return new HashMap<String, Object>();
		}
		return null;
	}
	
	@RequestMapping("/deleteSelectPasswordInfos")
	@ResponseBody
	public Map<String, Object> deleteSelectPasswordInfos(int[] selectIds) {
		if (selectIds != null && selectIds.length > 0) {
			passwordInfoService.deletePasswordByIds(selectIds);
			return new HashMap<>();
		}
		return null;
	}
}
