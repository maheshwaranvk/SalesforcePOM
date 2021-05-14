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
	
	public OpenOpportunity verifyOpportunity(String name) {
		as.assertTrue(driver.findElementByXPath("//div[@class='highlights slds-clearfix slds-page-header slds-page-header_record-home fixed-position']//*[text()='"+name+"']").isDisplayed());
		return this;
	}
	
	public UploadPDF clickUploadFileInOpportunity() {
		javaScriptClick(driver.findElementByXPath("(//div[@class='slds-tabs_card'])[2]//span[@class='slds-file-selector__button slds-button slds-button_neutral']"));
		return new UploadPDF(driver,js,as);
	}
}
