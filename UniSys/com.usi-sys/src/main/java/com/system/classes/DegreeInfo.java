package com.system.classes;

import java.util.List;
public class DegreeInfo extends Report {
	
    public String name; 
    public Integer period;
    public String semesters3;
    public List<Discipline> disciplineDegree;

    /**
     * Default constructor
     */
    public DegreeInfo() {
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPeriod() {
		return period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public String getSemesters3() {
		return semesters3;
	}

	public void setSemesters3(String semesters3) {
		this.semesters3 = semesters3;
	}

	public List<Discipline> getDisciplineDegree() {
		return disciplineDegree;
	}

	public void setDisciplineDegree(List<Discipline> disciplineDegree) {
		this.disciplineDegree = disciplineDegree;
	}

	

}