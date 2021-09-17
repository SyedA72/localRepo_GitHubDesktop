package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;

public class shopPage {


		public shopPage() {
			PageFactory.initElements(BaseClass.getDriver(), this);
		}
		
		@FindBy(xpath="//*[@id=\"content\"]/nav/a")
		public WebElement homeButtonField;
		
		@FindBy(xpath="//*[@class='price_slider_wrapper']/div[1]/span[2]")
		public WebElement sliderToTheRight;
		
		@FindBy(xpath="(//*[@type='submit'])[1]")
		public WebElement filterButtonField;
}
