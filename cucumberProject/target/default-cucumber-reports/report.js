$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/homePage.feature");
formatter.feature({
  "name": "HomePage testing Sliders and Arrivals",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User this on the main homePage",
  "keyword": "Given "
});
formatter.match({
  "location": "homePageStepDefinitions.user_this_on_the_main_homePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Shop Menu",
  "keyword": "When "
});
formatter.match({
  "location": "homePageStepDefinitions.click_on_Shop_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Home menu button",
  "keyword": "Then "
});
formatter.match({
  "location": "homePageStepDefinitions.click_on_Home_menu_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Review should be regarding the book user clicked on",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "name": "Click on Reviews tab there should be a review regarding the book user clicked on",
  "keyword": "And "
});
formatter.match({
  "location": "homePageStepDefinitions.click_on_Reviews_tab_there_should_be_a_review_regarding_the_book_user_clicked_on()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});