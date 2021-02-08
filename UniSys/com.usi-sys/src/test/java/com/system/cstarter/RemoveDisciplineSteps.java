package com.system.cstarter;

import static org.junit.Assert.assertEquals;

import com.system.models.RemoveDisciplineModel;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RemoveDisciplineSteps{
	RemoveDisciplineModel m4=new RemoveDisciplineModel();
	@Given("^Потребителя отваря екран с дисциплините$")
	public void OpenScreen() throws Throwable {
	  m4.navigateToAddScreen();
	}

	@When("^Избира номер на дисциплина \"([^\"]*)\"$")
	public void setDisciplineNumber(String number) throws Throwable {
	    m4.setNumber(number);
	}

	@And("^Натиска бутона за изтриване$")
	public void clickButtonDelete() throws Throwable {
	   m4.clickDeleteButton();
	}

	@Then("^Вижда съобщение за \"([^\"]*)\"$")
	public void returnMessage(String message) throws Throwable {
	   assertEquals(message,m4.getMessage());
	}
}