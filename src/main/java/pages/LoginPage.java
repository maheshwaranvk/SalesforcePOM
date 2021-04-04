package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.ProjectSpecificMethods;
import baseClass.WrapperClass;

public class LoginPage extends WrapperClass{
	
	public LoginPage(RemoteWebDriver driver,JavascriptExecutor js,SoftAssert as) {
		this.driver=driver;
		this.js=js;
		this.as=as;
	}
	
	public LoginPage enterUserName() {
		driver.findElementById("username").sendKeys("mercury.bootcamp@testleaf.com");
		return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElementById("password").sendKeys("Bootcamp$123");
		return this;
	}
	
	public HomePage clickLoginButton() {
		driver.findElementById("Login").click();
		return new HomePage(driver,js,as);
	}
	
	
}
