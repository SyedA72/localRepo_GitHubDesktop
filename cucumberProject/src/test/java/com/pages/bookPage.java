package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;

public class bookPage {

	public bookPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	
	@FindBy(xpath="//*[@itemprop='name']")
	public WebElement TitleField;
	
	@FindBy(xpath="//*[@id='tab-description']/p")
	public WebElement seleniumRubyDescriptionTextField;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[3]/ul/li[2]")
	public WebElement reviewTabField;
	
	@FindBy(xpath="//*[@id='tab-description']/div/div/div/p")
	public WebElement descriptionTextField;
	
	@FindBy(xpath="(//*[@type='submit'])[1]")
	public WebElement addToBasketButtonField;
	
	@FindBy(xpath="//*[@id=\"wpmenucartli\"]/a/span[1]")
	public WebElement basketButtonField;
}
