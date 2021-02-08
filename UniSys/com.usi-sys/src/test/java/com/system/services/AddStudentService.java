package com.system.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.system.classes.Student;


public class AddStudentService {

	public static String add(final String fn, String name, String course, String egn, String phone) {
		List<Student> list=getStudents();
		boolean isFnExists=list.stream().anyMatch(new Predicate<Student>() {
			public boolean test(Student l) {
				return l.getFacultyNumber().equals(fn);
			}
		}); 
		if(isFnExists) {
			return "Студент с такъв фн вече съществува.";
		}
		if(fn==null || "".equals(fn) || name==null ||"".equals(name) || course==null ||"".equals(course)|| egn==null ||"".equals(egn)|| phone==null||"".equals(phone)) {
			return "Всички полета с * са задължителни";
		}
		
		final Student newStudent=new Student(fn,name,course,egn,phone);
		list.add(newStudent);

		return list.contains(newStudent)?"Успешно добавяне":"Неуспешно добавяне";
	}

	public static List<Student>getStudents(){
		final Student newStudent=new Student("1801321029","Надя Г.","зимен","9909014534","0896405068");
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(newStudent);
		return list;
	}
}
