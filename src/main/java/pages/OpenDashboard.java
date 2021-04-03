package pages;

import baseClass.ProjectSpecificMethods;

public class OpenDashboard extends ProjectSpecificMethods{

	public OpenDashboard() {
		waitForIt("//h1//*[text()='Dashboard']");
	}
	
	public OpenDashboard verifyDashboard(String name) {
		as.assertTrue(driver.findElementByXPath("//h1//*[text()='"+name+"']").isDisplayed());
		return this;
	}
}
