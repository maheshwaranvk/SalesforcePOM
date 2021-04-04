package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.ProjectSpecificMethods;
import baseClass.WrapperClass;

public class CreateNewOpportunity extends WrapperClass{

	
	public CreateNewOpportunity(RemoteWebDriver driver,JavascriptExecutor js, SoftAssert as) {
		this.driver=driver;
		this.js=js;
		this.as=as;
		
		waitForIt("xpath","//div[@class='slds-modal__header']/*[text()='New Opportunity']");
	}
	
	public CreateNewOpportunity enterOpportunityName(String name) {
		driver.findElementByXPath("//input[@name='Name']").sendKeys(name);
		return this;
	}
	
	public CreateNewOpportunity enterCloseDate() {
		driver.findElementByXPath("//label[text()='Close Date']/following::input[@type='text' and @name='CloseDate']").click();
		javaScriptClick(driver.findElementByXPath("//button[text()='Today']"));
		return this;
	}
	
	public CreateNewOpportunity enterStage() {
		javaScriptClick(driver.findElementByXPath("//label[text()='Stage']/following::input[@role='combobox' and @required='']"));
		driver.findElementByXPath("//span[@title='Needs Analysis']").click();
		return this;
	}
	
	public OpenOpportunity clickSave() {
		driver.findElementByXPath("//button[text()='Save']").click();
		return new OpenOpportunity(driver,js,as);
	}
}
