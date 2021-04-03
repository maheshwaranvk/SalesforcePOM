package pages;

import baseClass.ProjectSpecificMethods;

public class CreateNewDashboard extends ProjectSpecificMethods{

	public CreateNewDashboard() {
		waitForIt("//iframe[@title='dashboard']");
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@title='dashboard']"));
	}
	
	public CreateNewDashboard enterDashboardName(String name) {
		driver.findElementById("dashboardNameInput").sendKeys(name);
		return this;
	}
	
	public CreateDashboard2 clickDashboardCreate() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Create']").click();
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@title='dashboard']"));
		Thread.sleep(3000);
		return new CreateDashboard2();
	}
	
}
