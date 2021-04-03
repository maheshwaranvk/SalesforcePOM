package pages;

import baseClass.ProjectSpecificMethods;

public class Opportunities extends ProjectSpecificMethods{

	
	public Opportunities() {
		waitForIt("//div[@data-aura-class='forceListViewManagerHeader']//*[@class='slds-var-p-right_x-small uiOutputText forceBreadCrumbItem' and text()='Opportunities']");
	}
	
	public CreateNewOpportunity clickNewOpportunities() {
		driver.findElementByXPath("//div[@title='New']").click();
		return new CreateNewOpportunity();

	}
}
