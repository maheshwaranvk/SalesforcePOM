package pages;

import baseClass.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public HomePage() {
		waitForIt("//div[@data-aura-class='onesetupSetupHeader']//*[text()='Home']");
	}
	
	public HomePage clickAppLauncher() {
		driver.findElementByXPath("//div[@class='slds-icon-waffle']").click();
		return this;
	}
	
	public AppLauncher clickViewAll() {
		driver.findElementByXPath("//button[text()='View All']").click();
		return new AppLauncher();
	}
	
}
