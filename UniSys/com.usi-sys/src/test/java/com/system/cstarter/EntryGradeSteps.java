package com.system.cstarter;

import static org.junit.Assert.assertEquals;

import com.system.models.EntryGradeModel;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EntryGradeSteps{
	EntryGradeModel m3=new EntryGradeModel();
	@Given("^Потребителя отваря екран за добавяне на оценка на студент$")
	public void OpenScreen() throws Throwable {
	  m3.navigateToScreen();
	}

	@When("^Въвежда име на дисциплината \"([^\"]*)\"$")
	public void setDisciplineName(String discipline) throws Throwable {
	  m3.setDisciplineName(discipline);
	}

	@And("^Въвежда оценка на студента \"([^\"]*)\"$")
	public void setGrade(Integer grade) throws Throwable {
	    m3.setGrade(grade);
	}

	@And("^Натиска бутона за добавяне на оценка$")
	public void clickButtonAddGrade() throws Throwable {
	    m3.clickAddGradeButton();
	}

	@Then("^Вижда  съобщение \"([^\"]*)\"$")
	public void returnMessage(String message) throws Throwable {
        assertEquals(message,m3.getAddMessage());
	}

}