package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.WrapperClass;

public class Sales extends WrapperClass{
	
	public Sales(RemoteWebDriver driver, JavascriptExecutor js, SoftAssert as) {
		this.driver=driver;
		this.js=js;
		this.as=as;
		waitForIt("xpath","//h2[@class='header-title-container title']/*[text()='Quarterly Performance']");
	}
	
	public Opportunities clickOpportunityFromSales() {
		javaScriptClick(driver.findElementByXPath("//div[@class='slds-context-bar']//*[text()='Opportunities']"));
		return new Opportunities(driver,js,as);

	}
}
