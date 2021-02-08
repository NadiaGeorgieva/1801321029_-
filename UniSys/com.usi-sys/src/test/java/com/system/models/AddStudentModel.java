package com.system.models;

import com.system.services.AddStudentService;

public class AddStudentModel {

	public String fn;
	public String name;
	public String course;
	public String egn;
	public String phone;
	public String message;

	public void navigateToAddScreen() {
		System.out.print("Навигирано е до страницата за вход в системата.");
	}

	public void setFn(String fn) {
		this.fn=fn;
	}

	public void setStudentName(String name) {
		this.name=name;
	}

	public void setCourse(String course) {
		this.course=course;
		
	}

	public void setEgn(String egn) {
		this.egn=egn;
	}

	public void setPhone(String phone) {
		this.phone=phone;
		
	}

	public void clickAddButton() {
	message=AddStudentService.add(fn,name,course,egn,phone);
		
	}

	public String getAddMessage() {
		return message;
	}
	
	

}
