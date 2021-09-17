package com.PHPtravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PHPtravels.utilities.BaseClass;

public class phpAdminDashboard {

	public phpAdminDashboard() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[3]/div/div[3]/a")
	public WebElement agentButtonField;
}
