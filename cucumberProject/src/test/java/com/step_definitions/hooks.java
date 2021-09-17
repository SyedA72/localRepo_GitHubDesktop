package com.step_definitions;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utilities.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {

	
	@Before
	public void setUp2() {
	//	BaseClass.getDriver().get(BaseClass.getProperty("url"));
		BaseClass.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		BaseClass.getDriver().manage().window().fullscreen();
		BaseClass.getDriver().get(BaseClass.getProperty("url"));
	}

	@After
	public void tearDown(Scenario scenario) {
		// only takes a screenshot if the scenario fails
		if (scenario.isFailed()) {
			// taking a screenshot
			final byte[] screenshot = ((TakesScreenshot) BaseClass.getDriver()).getScreenshotAs(OutputType.BYTES);
			// adding the screenshot to the report
			scenario.embed(screenshot, "image/png");
		}
		BaseClass.closeDriver();
	}
	
	
	
}
