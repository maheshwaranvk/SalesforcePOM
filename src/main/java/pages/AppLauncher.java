package pages;

import baseClass.ProjectSpecificMethods;

public class AppLauncher extends ProjectSpecificMethods{

	
	public AppLauncher() {
		waitForIt("//h2[text()='App Launcher']");
	}
	
	public Opportunities clickOppurtunities() {
		js.executeScript("arguments[0].click()", driver.findElementByXPath("//p[text()='Opportunities']"));
		return new Opportunities();
	}
	
	public Dashboards clickDashboard() {
		js.executeScript("arguments[0].click()", driver.findElementByXPath("//p[text()='Dashboards']"));
		return new Dashboards();

	}
}
