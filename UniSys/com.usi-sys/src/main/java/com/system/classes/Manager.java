package com.system.classes;

import java.util.Date;
import java.util.List;
public class Manager {

    public Inspector inspector;
    public Teacher teacher;
    public Student student;
    public Discipline discipline;
    public Report report;
    public Profile profile;
    public Gui gui;

    /**
     * Default constructor
     */
    public Manager() {
    }

    public Inspector getInspector() {
		return inspector;
	}

	public void setInspector(Inspector inspector) {
		this.inspector = inspector;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Discipline getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Gui getGui() {
		return gui;
	}

	public void setGui(Gui gui) {
		this.gui = gui;
	}

	/**
     * @param obj 
     * @return
     */
    public boolean processProfiles(Object obj) {
        // TODO implement here
        return false;
    }

    /**
     * @param obj 
     * @return
     */
    public boolean processDisciplines(Object obj) {
        // TODO implement here
        return false;
    }

    /**
     * @param obj 
     * @return
     */
    public boolean createProtocols(Object obj) {
        // TODO implement here
        return false;
    }

    /**
     * @param discipline 
     * @return
     */
    public List<Student> entryGrades(Discipline discipline) {
        // TODO implement here
        return null;
    }

    /**
     * @param obj 
     * @return
     */
    public boolean add(Object obj) {
        // TODO implement here
        return false;
    }

    /**
     * @param obj 
     * @return
     */
    public boolean update(Object obj) {
        // TODO implement here
        return false;
    }

    /**
     * @param obj 
     * @return
     */
    public boolean remove(Object obj) {
        // TODO implement here
        return false;
    }

    /**
     * @param start_date 
     * @return
     */
    public List<Discipline> searchExistedDiscipline(Date start_date) {
        // TODO implement here
        return null;
    }

    /**
     * @param discipline 
     * @return
     */
    public List<Student> searchCountOfStudents(String discipline) {
        // TODO implement here
        return null;
    }

}