Feature: HomePage testing Sliders and Arrivals

Background:
Given User this on the main homePage
When Click on Shop Menu
Then Click on Home menu button

Scenario: Home Page with three Sliders only


And Home page should have three sliders only

Scenario: Home Page with three Arrivals only


And Home page should have three arrivals only

Scenario: Home Page Images in arrivals should navigate


And Home page should have three arrivals only
And click on each image have it redirect you to the next page and confirm they are in the basket

Scenario: Description should be for the image user clicked on

And click on description tab the description should be regarding the book user clicked on

@smokeTest
Scenario:  Review should be regarding the book user clicked on 
And Click on Reviews tab there should be a review regarding the book user clicked on 