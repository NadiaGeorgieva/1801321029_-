package com.system.models;

import com.system.services.LogInService;

public class SystemLogModel {

	public String username;
	public String password;
	public String message;

	public void navigateToLogInScreen() {
		System.out.print("Навигирано е до страницата за вход в системата.");
		
	}

	public void setUsername(String username) {
	this.username=username;
		
	}

	public void setPassword(String password) {
		this.password=password;
	}

	public void clickLogInbButton() {
		message=LogInService.LogIn(username,password);
	}

	public String getLogInMessage() {
		return message;
	}

}
