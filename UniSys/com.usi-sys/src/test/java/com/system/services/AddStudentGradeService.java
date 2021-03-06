package com.system.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.system.classes.Discipline;



public class AddStudentGradeService {

	@SuppressWarnings("unlikely-arg-type")
	public static String add(final String discipline, Integer grade) {
		List<Discipline> list=getDisciplines();
		
		
		if(discipline==null || "".equals(discipline) || grade==null ||"".equals(grade)) {
			return "Всички полета с * са задължителни";
		}
		if(2>grade||grade>6) {
			return "Оценката е в диапазона от 2 до 6";
		}
		
		final Discipline newGrade=new Discipline(discipline,  grade);
		list.add(newGrade);
		List<Discipline> disciplines=getDisciplines();
		boolean isDisciplineExist=disciplines.stream()
				.anyMatch(new Predicate<Discipline>() {
					public boolean test(Discipline d) {
						return d.getName().equals(discipline) 
								;
					}
				});
		if(!isDisciplineExist) {
			return "Такава дисциплина няма в избрания спъсък";
		}

		return list.contains(newGrade)?"Успешно добавяне":"Неуспешно добавяне";
		
	}

	public static List<Discipline>getDisciplines(){
		final Discipline newDiscipline=new Discipline("sio",5);
		ArrayList<Discipline> list=new ArrayList<Discipline>();
		list.add(newDiscipline);
		return list;
	}
}
