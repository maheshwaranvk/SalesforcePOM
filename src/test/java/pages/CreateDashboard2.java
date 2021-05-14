package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.ProjectSpecificMethods;
import baseClass.WrapperClass;

public class CreateDashboard2 extends WrapperClass{

	
	public CreateDashboard2(RemoteWebDriver driver,JavascriptExecutor js,SoftAssert as) {
		
		this.driver=driver;
		this.js=js;	
		this.as=as;
		} 
	 
	
	public OpenDashboard clickDashboardDone() {
		driver.findElementByXPath("//button[text()='Done']").click();
		return new OpenDashboard(driver,js,as);	
		}
}
