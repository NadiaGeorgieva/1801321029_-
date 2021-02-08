package com.system.classes;

import java.util.List;

public class Report {
  
	public List<DegreeInfo> degreeInfo;
    public List<Student> student;
    
    /**
     * Default constructor
     */
    public Report() {
    }

	public List<DegreeInfo> getDegreeInfo() {
		return degreeInfo;
	}

	public void setDegreeInfo(List<DegreeInfo> degreeInfo) {
		this.degreeInfo = degreeInfo;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

  

}