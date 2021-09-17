package com.PHPtravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PHPtravels.utilities.BaseClass;



public class phpMainPage {
public phpMainPage() {
		
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	

	
	@FindBy(xpath="//*[@id=\"Main\"]/section[1]/div/div/div[3]/div/div/div[2]/div/div/div[1]/div/a")
	public WebElement adminLoginButtonField;
}
