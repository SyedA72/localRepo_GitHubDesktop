package com.step_definitions;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.pages.filteredPage;
import com.pages.homePage;
import com.pages.shopPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class shopPageStepDefinitions {
	homePage HomePage= new homePage();
	shopPage ShopPage= new shopPage();
	filteredPage FilteredPage = new filteredPage();
	
	
	
	@Given("User is on the main Home Page")
	public void user_is_on_the_main_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions
		
	}

	@When("User navigates to shop Page")
	public void user_navigates_to_shop_Page() {
	    // Write code here that turns the phrase above into concrete actions
		HomePage.shopButtonField.click();
	}


@Then("User adjusts the filter by {int} to {int} rps and clicks filter button")
public void user_adjusts_the_filter_by_to_rps_and_clicks_filter_button(Integer int1, Integer int2) {
	int maxSliderNumber=500;
	ShopPage.sliderToTheRight.click();
	System.out.println(int1);
	System.out.println(int2);
	System.out.println(maxSliderNumber);
 for (int i = 1; i <= maxSliderNumber-int2 ; i++) {
	ShopPage.sliderToTheRight.sendKeys(Keys.ARROW_LEFT);	
}
 ShopPage.filterButtonField.click();
}

@Then("User can view books between {int} to {int}")
public void user_can_view_books_between_to(Integer int1, Integer int2) {
    // Write code here that turns the phrase above into concrete actions

	List<WebElement> filteredBooks = FilteredPage.listOfFilteredBooks;
	
	for (int i = 0; i < filteredBooks.size(); i++) {
		System.out.println(filteredBooks.get(i).getText());
	}


}
	
	
	
}
