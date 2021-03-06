package testCase;

import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethods;
import baseClass.WrapperClass;
import pages.LoginPage;

public class SAL2CreateOpportunity extends WrapperClass{

	public String name ="BootCampt by Mahesh";
	
	@Test
	public void createOpportunity() {
		new LoginPage(driver,js,as)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickAppLauncher()
		.clickViewAll()
		.clickOppurtunities()
		.clickNewOpportunities()
		.enterOpportunityName(name)
		.enterCloseDate()
		.enterStage()
		.clickSave()
		.verifyOpportunity(name);
	}
}
