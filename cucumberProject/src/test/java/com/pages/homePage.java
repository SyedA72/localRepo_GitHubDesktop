package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;


public class homePage {
	
	public int numberOfSliders;
	public int numberOfArrivals;
	
	public homePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@id=\"main-nav-wrap\"]/ul/li[1]")
	public WebElement shopButtonField;
	
	@FindBy(xpath="(//*[@class=\"woocommerce\"])[1]")
	public WebElement seleniumRubyButtonField;
	
	@FindBy(xpath="(//*[@class=\"woocommerce\"])[2]")
	public WebElement thinkingInHTMLButtonField;
	
	@FindBy(xpath="(//*[@class=\"woocommerce\"])[3]")
	public WebElement masteringJAVAScriptButtonField;
	
	@FindBy(xpath="//*[@id='main-nav']/li[2]")
	public WebElement myAccountButtonField;
	
	@FindBy(xpath="//*[@class=\"tb-column-inner\"]/div/div/div/div[1]/div/div/div/div")
	private List<WebElement> listOfSlidersHomePage;

	@FindBy(xpath="(//*[@class=\"tb-column-inner\"])[2]/div/div/div/div")
	private List<WebElement> listOfArrivalsHomePage;

	public void Sliders() {
		numberOfSliders= listOfSlidersHomePage.size();
	
	}
	public void Arrivals() {
		numberOfArrivals= listOfSlidersHomePage.size();
		
	}




}
