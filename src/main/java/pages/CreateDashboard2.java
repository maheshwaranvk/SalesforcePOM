package pages;

import baseClass.ProjectSpecificMethods;

public class CreateDashboard2 extends ProjectSpecificMethods{

	public OpenDashboard clickDashboardDone() {
		driver.findElementByXPath("//button[text()='Done']").click();
		return new OpenDashboard();	
		}
}
