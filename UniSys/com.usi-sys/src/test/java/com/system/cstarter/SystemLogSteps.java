package com.system.cstarter;

import static org.junit.Assert.assertEquals;

import com.system.models.SystemLogModel;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SystemLogSteps{
	
SystemLogModel m1=new SystemLogModel();
@Given("^Потребителя отваря екран за вход в системата$")
public void OpenScreen() throws Throwable {
  m1.navigateToLogInScreen();
}

@When("^Въвежда потребителско име \"([^\"]*)\"$")
public void SetUsername(String username) throws Throwable {
     m1.setUsername(username);	
}

@And("^Въвежда парола \"([^\"]*)\"$")
public void SetPassword(String password) throws Throwable {
    m1.setPassword(password);
}

@And("^Натиска бутона за вход$")
public void ClickButtonLogIn() throws Throwable {
   m1.clickLogInbButton();
}


@Then("^Вижда съобщение \"([^\"]*)\"$")
public void Message(String expectedMessage) throws Throwable {
    assertEquals(expectedMessage,m1.getLogInMessage());
}

}