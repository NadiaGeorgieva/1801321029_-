package com.system.models;

import java.util.List;

import com.system.classes.Teacher;

public class AddTeacherDisciplineModel {

	public String name;
	public List<Teacher> disciplineNumber;
	public String message;

	public void navigateToLogInScreen() {
		
		
	}

	public void setName(String name) {
		this.name=name;
		
	}

	public void setDiscipline(List<Teacher> newDiscipline) {
		this.disciplineNumber=newDiscipline;
		
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	public void clickAddButton() {
		
		
	}

}
