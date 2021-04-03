package pages;


import baseClass.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	

	
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
		return new HomePage();
	}
	
	
}
