package com.step_definitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginPageStepDefinitions {


@Given("user is on the login Page")
public void user_is_on_the_login_Page() {
    // Write code here that turns the phrase above into concrete actions
  System.out.println("Hello ");
}

@When("user logs in with a valid credential")
public void user_logs_in_with_a_valid_credential() {
    // Write code here that turns the phrase above into concrete actions
  System.out.println("Hi");
}

@Then("user should be on the login page")
public void user_should_be_on_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("Bye");
}

@When("user logs in with a valid username and inValid Password")
public void user_logs_in_with_a_valid_username_and_inValid_Password() {
    // Write code here that turns the phrase above into concrete actions
  System.out.println("ahha");
}

@Then("user should receive an error message")
public void user_should_receive_an_error_message() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("msbkdx");
}

@When("user logs in with a INvalid credential")
public void user_logs_in_with_a_INvalid_credential() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("hsdbjkd");
}


	
	
}
