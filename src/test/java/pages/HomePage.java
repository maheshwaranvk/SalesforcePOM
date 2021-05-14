package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.ProjectSpecificMethods;
import baseClass.WrapperClass;

public class HomePage extends WrapperClass{
	
	public HomePage(RemoteWebDriver driver,JavascriptExecutor js,SoftAssert as) {
		this.driver=driver;
		this.js=js;
		this.as=as;
		waitForIt("xpath","//div[@data-aura-class='onesetupSetupHeader']//*[text()='Home']");
	}
	
	public HomePage clickAppLauncher() {
		driver.findElementByXPath("//div[@class='slds-icon-waffle']").click();
		return this;
	}
	
	public AppLauncher clickViewAll() {
		driver.findElementByXPath("//button[text()='View All']").click();
		return new AppLauncher(driver,js,as);
	}
	
	public AppleStoreRedirect clickDownloadSalesForceA() {
	while(driver.findElementByXPath("//div[@class='tileHelp']//*[text()='Download SalesforceA']").isDisplayed()==false) {
		elementClick("xpath", "//div[@class='rightScroll']/button");
	}
	
	elementClick("xpath", "//div[@class='tileHelp']//button[@title='App Store']");
	getwindows(1);
	return new AppleStoreRedirect(driver,js,as);
	}
	
	public ReleaseNotes clickGetStartedFromViewReleaseNotes() {
		while(!(driver.findElementByXPath("//span[text()='View Release Notes']").isDisplayed())){
		elementClick("xpath", "//button[@class='slds-button slds-button--neutral rightArrowButton uiButton']");
		}
		elementClick("xpath", "(//article[@class='onesetupHelpTile']//span[text()='View Release Notes']/following::span[text()='Get Started'])[1]");
		return new ReleaseNotes(driver,js,as);
	}
}
