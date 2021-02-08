package com.system.cstarter;

import static org.junit.Assert.assertEquals;

import com.system.models.AddStudentModel;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddStudentSteps {
	
	AddStudentModel m2=new AddStudentModel();
	
	@Given("^Потребителя отваря екран за добавяне на студент$")
	public void OpenScreen() throws Throwable {
	   m2.navigateToAddScreen();
	}

	@When("^Въвежда фн \"([^\"]*)\"$")
	public void setFn(String fn) throws Throwable {
	    m2.setFn(fn);
	}

	@And("^Въвежда име на студента \"([^\"]*)\"$")
	public void setStudentName(String name) throws Throwable {
	   m2.setStudentName(name);
	}

	@And("^Въвежда курс \"([^\"]*)\"$")
	public void setCourse(String course) throws Throwable {
	   m2.setCourse(course);
	}

	@And("^Въвежда егн \"([^\"]*)\"$")
	public void setEgn(String egn) throws Throwable {
    	m2.setEgn(egn);
	}

	@And("^Въвежда телефон \"([^\"]*)\"$")
	public void setPhone(String phone) throws Throwable {
	m2.setPhone(phone);  
	}

	@And("^Натиска бутона за добавяне на студент$")
	public void clickButtonAdd() throws Throwable {
	   m2.clickAddButton();
	}

	@Then("^Вижда съобщение  \"([^\"]*)\"$")
	public void returnMessage(String message) throws Throwable {
	   assertEquals(message,m2.getAddMessage());
	}

	
}