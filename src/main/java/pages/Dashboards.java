package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.ProjectSpecificMethods;
import baseClass.WrapperClass;

public class Dashboards extends WrapperClass{

	public Dashboards(RemoteWebDriver driver,JavascriptExecutor js, SoftAssert as) {
		this.driver=driver;
		this.js=js;
		this.as=as;
		waitForIt("xpath","//li[@class='slds-breadcrumb__item entityName']/*[text()='Dashboards']");
	}
	
	public CreateNewDashboard clickNewDashboard() {
		javaScriptClick(driver.findElementByXPath("//div[text()='New Dashboard']"));
		return new CreateNewDashboard(driver,js,as);
	}
	
}
