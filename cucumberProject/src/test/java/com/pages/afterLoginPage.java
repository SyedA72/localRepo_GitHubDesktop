package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;

public class afterLoginPage {
	public afterLoginPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	@FindBy(xpath="//*[@class='woocommerce-MyAccount-content']/p[1]/a")
	public WebElement signOutButtonField;
}
