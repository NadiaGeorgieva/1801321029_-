package com.system.cstarter;

import static org.junit.Assert.assertEquals;

import java.util.List;

import com.system.classes.Teacher;
import com.system.models.AddTeacherDisciplineModel;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTeacherDisciplineSteps{
	AddTeacherDisciplineModel m5=new AddTeacherDisciplineModel();
	@Given("^Потребителя отваря екран с учителите$")
	public void OpenScreen() throws Throwable {
	   m5.navigateToLogInScreen();
	}

	@When("^Избира учител по име \"([^\"]*)\"$")
	public void setTeacherName(String name) throws Throwable {
	   m5.setName(name);
	}

	@And("^Назначава в неговия списък с дисциплини новата дисциплина \"([^\"]*)\"$")
	public void setDisciplineNumbers(List<Teacher> newDiscipline) throws Throwable {
	   m5.setDiscipline(newDiscipline);
	}

	@And("^Натиска бутона за добавяне на дисциплината за съответния учител$")
	public void clickButtonAdd() throws Throwable {
	    m5.clickAddButton();
	}

	@Then("^Виждa съобщение \"([^\"]*)\"$")
	public void returnMessage(String message) throws Throwable {
	  assertEquals(message,m5.getMessage());
	}

}