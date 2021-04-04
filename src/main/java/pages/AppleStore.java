package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.WrapperClass;

public class AppleStore extends WrapperClass{

	public AppleStore(RemoteWebDriver driver,JavascriptExecutor js,SoftAssert as) {
		this.driver=driver;
		this.js=js;
		this.as=as;
	}
	
	public void verifyAppleStoreUrl(String url) {
		as.assertTrue(driver.getCurrentUrl().contains(url));
	}
	
	
}
