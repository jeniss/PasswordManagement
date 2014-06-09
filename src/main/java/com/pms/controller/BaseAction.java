package com.pms.controller;

import javax.annotation.Resource;

import com.pms.service.PasswordInfoService;

/**
 * @author Jeniss 2014-4-22 下午3:27:03
 * @tags 
 */
public class BaseAction {
	@Resource(name="passwordInfoService")
	public PasswordInfoService passwordInfoService;
}
