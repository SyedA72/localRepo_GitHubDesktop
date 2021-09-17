Feature: Login Features

Scenario: User loging in with a valid credentials

Given user is on the login Page
When user logs in with a valid credential
Then user should be on the login page






Scenario: User loging in with a valid username and inValid Password

Given user is on the login Page
When user logs in with a valid username and inValid Password
Then user should receive an error message


 
Scenario: User loging in with an inValid credentials

Given user is on the login Page
When user logs in with a INvalid credential
Then user should receive an error message
