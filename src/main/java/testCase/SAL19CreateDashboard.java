package testCase;

import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethods;
import pages.LoginPage;

public class SAL19CreateDashboard extends ProjectSpecificMethods{

	public String name ="Salesforce Automation by Mahesh";
	
	@Test
	public void createDashboard() throws InterruptedException {
		new LoginPage()
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
