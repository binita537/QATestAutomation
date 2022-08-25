package com.orangehrm.stepdefinitions;

import io.cucumber.java8.En;

public class LoginPageDefinitaion extends BaseStepDefinitions implements En {

	

	public LoginPageDefinitaion()
	{
	 Given("user navigate to the login page", () -> {
		 
     });
	 
	 
     When("user enter valid {username} and {password}", (String username,String password) -> {
    	 
    	 loginPage.enterUsername(username).enterPassword(password);
     });
     
     
     Then("user is successfully logged in", () -> {
    	 loginPage.clickLoginButton();
     });
     
	}
     
}
