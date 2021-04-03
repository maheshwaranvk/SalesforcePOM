package pages;

import baseClass.ProjectSpecificMethods;

public class CreateNewOpportunity extends ProjectSpecificMethods{

	
	public CreateNewOpportunity() {
		waitForIt("//div[@class='slds-modal__header']/*[text()='New Opportunity']");
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
		return new OpenOpportunity();
	}
}
