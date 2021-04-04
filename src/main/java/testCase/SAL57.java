package testCase;

import org.testng.annotations.Test;

import baseClass.WrapperClass;
import pages.LoginPage;

public class SAL57 extends WrapperClass{
	public String url ="https://apps.apple.com/us/app/salesforcea/";
	
	@Test
	public void verifyAppleApp() {
	
		new LoginPage(driver,js,as)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickDownloadSalesForceA()
		.clickAppleStoreRedirectConfirm()
		.verifyAppleStoreUrl(url);
		
		as.assertAll();
	}
}
