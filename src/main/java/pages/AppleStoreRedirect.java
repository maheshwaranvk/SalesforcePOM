package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.WrapperClass;

public class AppleStoreRedirect extends WrapperClass{
	
	public AppleStoreRedirect(RemoteWebDriver driver, JavascriptExecutor js,SoftAssert as) {
		this.driver=driver;
		this.js=js;
		this.as=as;
	}
	
	public AppleStore clickAppleStoreRedirectConfirm() {
		driver.findElementByXPath("//button[text()='Confirm']").click();
		return new AppleStore(driver,js,as);
	}
	
}
