package testCase;

import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethods;
import baseClass.WrapperClass;
import pages.LoginPage;

public class SAL19CreateDashboard extends WrapperClass{

	public String name ="Salesforce Automation by Mahesh";
	
	@Test
	public void createDashboard() throws InterruptedException {
		new LoginPage(driver,js,as)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickAppLauncher()
		.clickViewAll()
		.clickDashboard()
		.clickNewDashboard()
		.enterDashboardName(name)
		.clickDashboardCreate()
		.clickDashboardDone()
		.verifyDashboard(name);

	}
}
