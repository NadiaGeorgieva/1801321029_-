package com.system.cstarter;

import static org.junit.Assert.assertEquals;

import com.system.models.UpdateInfoModel;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpdateInfoSteps{
	UpdateInfoModel m3=new UpdateInfoModel();
	@Given("^Потребителя отваря екран за студентската информация в системата$")
	public void OpenScreen() throws Throwable {
	    m3.navigateToAddScreen();
	}

	@When("^Въвежда нов телефон за връзка с съответния студент \"([^\"]*)\"$")
	public void setPhone(String phone) throws Throwable {
	   m3.setPhone(phone);
	}

	@And("^Натиска бутона за редактиране на студентската информация$")
	public void clickButtonUpdate() throws Throwable {
	    m3.clickUpdateButton();
	}

	@Then("^Вижда съобщение  за \"([^\"]*)\"$")
	public void returnMessage(String message) throws Throwable {
	  assertEquals(message,m3.getMessage());
	}
}