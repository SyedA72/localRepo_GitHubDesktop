Feature: My Account login related tests

Background:  
     Given User is on the main homePage

Scenario Outline: Log-in with valid userName and Password

  When User submits a valid "<Username>" and a valid "<Password>"
  Then The User should be successfully Loged in
  
Examples:
 
|Username   |Password|
|imustajabas|Kashabbasnamarayjatay|
|sma211221  |Salamyahussain51214|  