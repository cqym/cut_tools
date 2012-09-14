package com.tl.resource.business.dto;

import java.util.List;

public class LoginInforDto {
	private UserDto user = null;
	private List<ModulesDto> modules = null;
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	public List<ModulesDto> getModules() {
		return modules;
	}
	public void setModules(List<ModulesDto> modules) {
		this.modules = modules;
	}
	
}
