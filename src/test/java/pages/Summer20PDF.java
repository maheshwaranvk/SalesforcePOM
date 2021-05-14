package pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.WrapperClass;

public class Summer20PDF extends WrapperClass{
	
public Summer20PDF(RemoteWebDriver driver,JavascriptExecutor js,SoftAssert as) {
	this.driver=driver;
	this.js=js;
	this.as=as;
	getwindows(2);
	}
	
	public Summer20PDF verifySummer20PDF() throws IOException {
		as.assertTrue(readPDF(driver.getCurrentUrl(),"Salesforce Spring ’21 Release"));
		return this;
}
	}
