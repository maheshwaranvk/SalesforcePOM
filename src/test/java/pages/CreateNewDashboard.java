package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.ProjectSpecificMethods;
import baseClass.WrapperClass;

public class CreateNewDashboard extends WrapperClass{

	public CreateNewDashboard(RemoteWebDriver driver,JavascriptExecutor js,SoftAssert as) {
		this.driver=driver;
		this.js=js;
		this.as=as;
		
		waitForIt("xpath","//iframe[@title='dashboard']");
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@title='dashboard']"));
	}
	
	public CreateNewDashboard enterDashboardName(String name) {
		driver.findElementById("dashboardNameInput").sendKeys(name);
		return this;
	}
	
	public CreateDashboard2 clickDashboardCreate() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Create']").click();
		
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@title='dashboard']"));
		return new CreateDashboard2(driver,js,as);
	}
	
}
