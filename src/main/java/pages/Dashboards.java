package pages;

import baseClass.ProjectSpecificMethods;

public class Dashboards extends ProjectSpecificMethods{

	public Dashboards() {
		waitForIt("//li[@class='slds-breadcrumb__item entityName']/*[text()='Dashboards']");
	}
	
	public CreateNewDashboard clickNewDashboard() {
		javaScriptClick(driver.findElementByXPath("//div[text()='New Dashboard']"));
		return new CreateNewDashboard();
	}
	
}
