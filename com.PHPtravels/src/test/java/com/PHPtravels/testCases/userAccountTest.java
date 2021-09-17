package com.PHPtravels.testCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.PHPtravels.pages.phpAdminDashboard;
import com.PHPtravels.pages.phpAdminLogin;
import com.PHPtravels.pages.phpMainPage;
import com.PHPtravels.utilities.BaseClass;
import com.PHPtravels.utilities.browserUtilities;

@Listeners(com.PHPtravels.utilities.TESTNGlisteners.class)



public class userAccountTest {
	phpMainPage PhpMain = new phpMainPage();

	phpAdminLogin PhpAdmin = new phpAdminLogin();
	
	phpAdminDashboard PhpDashboard = new phpAdminDashboard();
@Test
public void deleteUsers() {
	PhpMain.adminLoginButtonField.click();
	browserUtilities.windowHandle();
	PhpAdmin.adminEmailInputField.sendKeys(BaseClass.getProperty("administratorEmail"));
	PhpAdmin.adminPasswordInputField.sendKeys(BaseClass.getProperty("administratorPassword"));
    PhpAdmin.adminLoginButtonField.click();
    PhpDashboard.agentButtonField.click();

}

@Test
public void addUser() {
	
}


}

	
	
	

