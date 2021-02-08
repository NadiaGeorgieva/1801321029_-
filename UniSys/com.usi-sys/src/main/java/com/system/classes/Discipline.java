package com.system.classes;

import java.util.Date;

public class Discipline {

    public Integer number;
    public String name;
    public Integer grade;
    public Date start_Date;

    /**
     * Default constructor
     * @param grade 
     * @param discipline 
     */
    public Discipline(String discipline, Integer grade) {
    }
    
  

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getStart_Date() {
		return start_Date;
	}

	public void setStart_Date(Date start_Date) {
		this.start_Date = start_Date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

}