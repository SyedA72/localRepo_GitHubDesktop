Feature: Shop filter sorting and adding to cart functionalities


Background:
Given User is on the main Home Page
When User navigates to shop Page


Scenario Outline: Shop Filter By Price Functionality


Then User adjusts the filter by <Number1> to <Number2> rps and clicks filter button
And User can view books between <Number1> to <Number2>

Examples:

      |Number1|Number2|
      |150    |450    |
      |150    |300    |