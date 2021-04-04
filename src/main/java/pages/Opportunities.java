package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.ProjectSpecificMethods;
import baseClass.WrapperClass;

public class Opportunities extends WrapperClass{

	
	public Opportunities(RemoteWebDriver driver,JavascriptExecutor js,SoftAssert as) {
		this.driver=driver;
		this.js=js;
		this.as=as;
		waitForIt("xpath","//div[@data-aura-class='forceListViewManagerHeader']//*[@class='slds-var-p-right_x-small uiOutputText forceBreadCrumbItem' and text()='Opportunities']");
	}
	
	public CreateNewOpportunity clickNewOpportunities() {
		driver.findElementByXPath("//div[@title='New']").click();
		return new CreateNewOpportunity(driver,js,as);

	}
}
