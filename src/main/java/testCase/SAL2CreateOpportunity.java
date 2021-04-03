package testCase;

import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethods;
import pages.LoginPage;

public class SAL2CreateOpportunity extends ProjectSpecificMethods{

	public String name ="BootCampt by Mahesh";
	
	@Test
	public void createOpportunity() {
		new LoginPage()
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
