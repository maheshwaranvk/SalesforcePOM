package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
	
	public Opportunities searchOpportunity(String searchVal) throws InterruptedException {
		js.executeScript("arguments[0].value='"+searchVal+"'", driver.findElementByXPath("//input[@class='slds-input']"));
		locateElement("xpath", "//input[@class='slds-input']").sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		return this;
	}
	
	public OpenOpportunity clickFirstSearchedItem() {
		elementClick("xpath", "(//table[@role='grid']//tr//th//a[contains(@title,'Bootcamp')])[1]");
		return new OpenOpportunity(driver,js,as);
	}

}
