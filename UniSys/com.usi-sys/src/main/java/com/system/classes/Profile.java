package com.system.classes;


import java.util.List;

public class Profile {
	
    public List<Teacher> teacherProfile;
    public List<Student> studentProfile;
    
    /**
     * Default constructor
     */
    public Profile() {
    }

	public List<Teacher> getTeacherProfile() {
		return teacherProfile;
	}

	public void setTeacherProfile(List<Teacher> teacherProfile) {
		this.teacherProfile = teacherProfile;
	}

	public List<Student> getStudentProfile() {
		return studentProfile;
	}

	public void setStudentProfile(List<Student> studentProfile) {
		this.studentProfile = studentProfile;
	}


}