package com.pms.model;

import java.util.List;

/**
 * @author Jeniss 2014-4-22 下午3:29:06
 * @tags 
 */
public class PasswordName {
	private String name;
	private List<PasswordInfo> passwordInfos;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<PasswordInfo> getPasswordInfos() {
		return passwordInfos;
	}
	public void setPasswordInfos(List<PasswordInfo> passwordInfos) {
		this.passwordInfos = passwordInfos;
	}
}
