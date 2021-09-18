package com.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.basketPage;
import com.pages.bookPage;
import com.pages.homePage;
import com.pages.shopPage;
import com.utilities.BaseClass;
import com.utilities.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class homePageStepDefinitions {
	homePage HomePage = new homePage();
	shopPage ShopPage = new shopPage();
	bookPage BookPage = new bookPage();
	basketPage BasketPage = new basketPage();
	WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(),30);
	
	@Given("User this on the main homePage")
	public void user_this_on_the_main_homePage() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("Click on Shop Menu")
	public void click_on_Shop_Menu() {
		// Write code here that turns the phrase above into concrete actions
		HomePage.shopButtonField.click();
	}

	@Then("Click on Home menu button")
	public void click_on_Home_menu_button() {
		// Write code here that turns the phrase above into concrete actions
		ShopPage.homeButtonField.click();
	}

	@Then("Home page should have three sliders only")
	public void home_page_should_have_three_sliders_only() {

		HomePage.Sliders();
		String ExpectedValue = BaseClass.getProperty("numOfSlider");
		int expectedSliders = Integer.parseInt(ExpectedValue);
		Assert.assertEquals(HomePage.numberOfSliders, expectedSliders);

	}

	@Then("Home page should have three arrivals only")
	public void home_page_should_have_three_arrivals_only() {
		// Write code here that turns the phrase above into concrete actions
		HomePage.Arrivals();
		int expectedArrivals = Integer.parseInt(BaseClass.getProperty("numOfArrival"));
		Assert.assertEquals(HomePage.numberOfArrivals, expectedArrivals);

	}

	@Then("click on each image have it redirect you to the next page and confirm they are in the basket")
	public void click_on_each_image_have_it_redirect_you_to_the_next_page_and_confirm_they_are_in_the_basket() {
		// Write code here that turns the phrase above into concrete actions

		home_page_should_have_three_arrivals_only();
		HomePage.seleniumRubyButtonField.click();
		Assert.assertEquals(BookPage.TitleField.getText(), BaseClass.getProperty("text1"));
		BookPage.addToBasketButtonField.click();
//	HomePage.shopButtonField.click();
		ShopPage.homeButtonField.click();
		HomePage.thinkingInHTMLButtonField.click();
		Assert.assertEquals(BookPage.TitleField.getText(), BaseClass.getProperty("text2"));
		BookPage.addToBasketButtonField.click();
		// HomePage.shopButtonField.click();
		ShopPage.homeButtonField.click();
		HomePage.masteringJAVAScriptButtonField.click();
		Assert.assertEquals(BookPage.TitleField.getText(), BaseClass.getProperty("text3"));
		BookPage.addToBasketButtonField.click();

		BookPage.basketButtonField.click();
		BasketPage.baskets();
		// System.out.println(BasketPage.numberOfItems);
		int expectedItemsInBasket = Integer.parseInt(BaseClass.getProperty("numOfArrival"));
		Assert.assertEquals(BasketPage.numberOfItems, expectedItemsInBasket);

	}

	@Then("click on description tab the description should be regarding the book user clicked on")
	public void click_on_description_tab_the_description_should_be_regarding_the_book_user_clicked_on() {
		// Write code here that turns the phrase above into concrete actions
		home_page_should_have_three_arrivals_only();
		HomePage.seleniumRubyButtonField.click();
//	BookPage.descriptionButtonField.click();n  
		Assert.assertTrue(BookPage.seleniumRubyDescriptionTextField.getText().contains(BaseClass.getProperty("texta")));
		ShopPage.homeButtonField.click();

		HomePage.thinkingInHTMLButtonField.click();
		// BookPage.descriptionButtonField.click();
		Assert.assertTrue(BookPage.descriptionTextField.getText().contains(BaseClass.getProperty("textb")));
		ShopPage.homeButtonField.click();

		HomePage.masteringJAVAScriptButtonField.click();
//	BookPage.descriptionButtonField.click();
		Assert.assertTrue(BookPage.descriptionTextField.getText().contains(BaseClass.getProperty("textc")));

	}

	@Then("Click on Reviews tab there should be a review regarding the book user clicked on")
	public void click_on_Reviews_tab_there_should_be_a_review_regarding_the_book_user_clicked_on() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		home_page_should_have_three_arrivals_only();
		HomePage.seleniumRubyButtonField.click();
		
		CommonMethods.wait(3);
		CommonMethods.jsClick(BookPage.reviewTabField);
		
		
//		Actions action = new Actions(BaseClass.getDriver());
//action.click(BookPage.reviewTabField).build().perform();
	//	wait.until(ExpectedConditions.elementToBeClickable(BookPage.reviewTabField)).click();
      //  BookPage.reviewTabField.click();
		Thread.sleep(2000);
		ShopPage.homeButtonField.click();
		
		HomePage.thinkingInHTMLButtonField.click();
//		wait.until(ExpectedConditions.elementToBeClickable(BookPage.reviewTabField)).click();
		CommonMethods.wait(3);
		CommonMethods.jsClick(BookPage.reviewTabField);
	//	BookPage.reviewTabField.click();
		ShopPage.homeButtonField.click();

		HomePage.masteringJAVAScriptButtonField.click();
//		wait.until(ExpectedConditions.elementToBeClickable(BookPage.reviewTabField)).click();
		CommonMethods.wait(3);
		CommonMethods.jsClick(BookPage.reviewTabField);
		//BookPage.reviewTabField.click();
	}

}
