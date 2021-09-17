package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;

public class basketPage {
public int numberOfItems;
	
	public basketPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@class=\"woocommerce\"]/form/table/tbody/tr")
	private List<WebElement> listOfItemsInBasket;
	
	

	public void baskets() {
		numberOfItems= listOfItemsInBasket.size()-1;
	
	}
	
	
	
}
