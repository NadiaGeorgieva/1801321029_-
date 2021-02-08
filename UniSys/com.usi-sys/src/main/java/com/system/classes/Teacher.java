package com.system.classes;

import java.util.List;

public class Teacher extends User {
 
	public String fullName;
    public String email;
    public List<Discipline> disciplineTeacher;
    
    /**
     * Default constructor
     */
    public Teacher() {
    }

 
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Discipline> getDisciplineTeacher() {
		return disciplineTeacher;
	}

	public void setDisciplineTeacher(List<Discipline> disciplineTeacher) {
		this.disciplineTeacher = disciplineTeacher;
	}

}