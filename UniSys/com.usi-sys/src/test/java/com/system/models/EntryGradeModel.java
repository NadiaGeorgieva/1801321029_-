package com.system.models;

import com.system.services.AddStudentGradeService;


public class EntryGradeModel {

	public String discipline;
	public Integer grade;
	public String message;

	public void navigateToScreen() {
		System.out.print("Навигирано е до страницата за добавяне на оценка за съответната дисциплина на студента.");
		
	}

	public void setDisciplineName(String discipline) {
	this.discipline=discipline;
		
	}

	public void setGrade(Integer grade) {
		this.grade=grade;
		
	}

	public void clickAddGradeButton() {
		message=AddStudentGradeService.add(discipline,grade);
		
	}

	public String getAddMessage() {
		
		return message;
	}
	

}
