package com.system.classes;

import java.util.List;

public class Student extends User {
	
    public String facultyNumber;
    public String fullName;
    public String course;
    public String egn;
    public String phone;
    public List<Discipline> disciplineStudent;
    
  
    public Student(String fn, String name, String course, String egn, String phone) {
    }

	public String getFacultyNumber() {
		return facultyNumber;
	}

	public void setFacultyNumber(String facultyNumber) {
		this.facultyNumber = facultyNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getEgn() {
		return egn;
	}

	public void setEgn(String egn) {
		this.egn = egn;
	}

	public String getPhone() {
		return phone;
	}

	public List<Discipline> getDisciplineStudent() {
		return disciplineStudent;
	}

	public void setDisciplineStudent(List<Discipline> disciplineStudent) {
		this.disciplineStudent = disciplineStudent;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

    

}