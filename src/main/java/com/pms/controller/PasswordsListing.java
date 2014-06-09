package com.pms.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pms.model.PasswordName;

/*
 *@author Jeniss 2014-3-5 ����9:53:06
 *@tags
 */
@Controller
public class PasswordsListing extends BaseAction {
	/**
	 * @author Jeniss 2014-4-22 下午3:35:46
	 * @tags 获取所查询的密码信息列表
	 */
	@RequestMapping(value = "/search")
	public String searchPasswords(@RequestParam String searchKeyStr, ModelMap modelMap,
			HttpServletResponse response) throws Exception {
		List<PasswordName> passwordInfosOrderByName = null;
		if (searchKeyStr == null || "".equals(searchKeyStr.trim()) || "undefined".equals(searchKeyStr)) {
			passwordInfosOrderByName = passwordInfoService.getAllPasswordInfosOrderByName();
		} else {
			passwordInfosOrderByName = passwordInfoService
					.getSearchPasswordInfosOrderByName(searchKeyStr);
		}
		if (passwordInfosOrderByName != null) {
			modelMap.put("list", passwordInfosOrderByName);
		}
		response.setContentType("text/html;charset=UTF-8");
		return "/function/infoListTable";
	}

	@RequestMapping({ "/listing", "/" })
	public String Listing(ModelMap modelMap) {
		return "/ListAllPasswords";
	}
}
