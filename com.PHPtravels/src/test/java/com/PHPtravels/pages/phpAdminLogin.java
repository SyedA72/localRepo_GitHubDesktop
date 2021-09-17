package com.PHPtravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PHPtravels.utilities.BaseClass;

public class phpAdminLogin {
public phpAdminLogin() {
		
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="/html/body/div[1]/form[1]/div[1]/label[1]/input")
	public WebElement adminEmailInputField;
	@FindBy(xpath="/html/body/div[1]/form[1]/div[1]/label[2]/input")
	public WebElement adminPasswordInputField;
	@FindBy(xpath="/html/body/div[1]/form[1]/button")
	public WebElement adminLoginButtonField;
	
}
