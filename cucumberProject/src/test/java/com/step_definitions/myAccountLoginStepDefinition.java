package com.step_definitions;

import org.junit.Assert;

import com.pages.afterLoginPage;
import com.pages.homePage;
import com.pages.myAccountPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class myAccountLoginStepDefinition {

	homePage HomePage = new homePage();
	myAccountPage MyAccountPage = new myAccountPage();
	afterLoginPage AfterLoginPage = new afterLoginPage();

@Given("User is on the main homePage")
public void user_is_on_the_main_homePage() {
    // Write code here that turns the phrase above into concrete actions
	//HomePage.myAccountButtonField.click();
}

@When("User submits a valid {string} and a valid {string}")
public void user_submits_a_valid_and_a_valid(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	HomePage.myAccountButtonField.click();
	MyAccountPage.usernameInputField.sendKeys(string);
	MyAccountPage.passwordInputField.sendKeys(string2);
	MyAccountPage.loginButtonField.click();
	
}

@Then("The User should be successfully Loged in")
public void the_User_should_be_successfully_Loged_in() {
    // Write code here that turns the phrase above into concrete actions
   Assert.assertTrue(AfterLoginPage.signOutButtonField.isDisplayed());
}

	
	
}
