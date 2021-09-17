package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;

public class myAccountPage {
	public myAccountPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(id="username")
	public WebElement usernameInputField;
	@FindBy(id="password")
	public WebElement passwordInputField;
	@FindBy(xpath="//*[@name='login']")
	public WebElement loginButtonField;
	
}
