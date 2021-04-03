package pages;

import baseClass.ProjectSpecificMethods;

public class OpenOpportunity extends ProjectSpecificMethods{

	public OpenOpportunity() {
		waitForIt("//div[@class='entityNameTitle slds-line-height--reset']");
	}
	
	public void verifyOpportunity(String name) {
		as.assertTrue(driver.findElementByXPath("//div[@class='highlights slds-clearfix slds-page-header slds-page-header_record-home fixed-position']//*[text()='"+name+"']").isDisplayed());

	}
}
