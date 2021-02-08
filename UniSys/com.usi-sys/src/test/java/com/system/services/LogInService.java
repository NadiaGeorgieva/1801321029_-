package com.system.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.system.classes.User;

public class LogInService {
  public static String LogIn(final String username, final String password) {
	  if(username==null && password==null) {
		  return "Няма въведено потребителско име и парола";
	  }
	  if(username==null) {
		  return  "Няма въведено потребителско име!";
	  }
	  if(password==null) {
		  return  "Няма въведена парола!";
	  }
	  List<User> users=getUsers();
		boolean isUserExist=users.stream()
				.anyMatch(new Predicate<User>() {
					public boolean test(User users) {
						return users.getUsername().equals(username) && users.getPassword().equals(password);
					}
				});
		return isUserExist ? "OK" : "Потребител с тези данни не съществува!";
  }
	
	
	private static List<User> getUsers(){
		User user=new User();
		user.setUsername("Uni");
		user.setPassword("Pass");
		final List<User> result=new ArrayList<User>();
		result.add(user);
		return result;
	}
}