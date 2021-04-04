package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.ProjectSpecificMethods;
import baseClass.WrapperClass;

public class OpenOpportunity extends WrapperClass{

	public OpenOpportunity(RemoteWebDriver driver,JavascriptExecutor js,SoftAssert as) {
		this.driver=driver;
		this.js=js;
		this.as=as;
		waitForIt("xpath","//div[@class='entityNameTitle slds-line-height--reset']");
	}
	
	public void verifyOpportunity(String name) {
		as.assertTrue(driver.findElementByXPath("//div[@class='highlights slds-clearfix slds-page-header slds-page-header_record-home fixed-position']//*[text()='"+name+"']").isDisplayed());

	}
}
