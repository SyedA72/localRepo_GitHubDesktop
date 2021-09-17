package com.utilities;

public class PageInitializer extends BaseClass{
	public static LoginPageElements login;
	public static AddEmployeePageElements addEmp;
	public static DashboardPageElements dashboard;
	public static PersonalDetailsPageElements pdetails;
	public static ViewEmployeePageElements viewEmp;
	public static sauceDemoLoginPage sacelogin;
	
	public static void initialize() {
		
		login=new LoginPageElements();
		dashboard=new DashboardPageElements();
		addEmp=new AddEmployeePageElements();
		pdetails=new PersonalDetailsPageElements();
		viewEmp=new ViewEmployeePageElements();
		sacelogin=new sauceDemoLoginPage();
		
	}
}
