package testCase;

import java.awt.AWTException;

import org.testng.annotations.Test;

import baseClass.WrapperClass;
import pages.LoginPage;

public class SAL81 extends WrapperClass{

	public String searchVal="Bootcamp";
	public String filePath = "C:\\Users\\Mahesh\\Desktop\\periyar.pdf";
	
	@Test
	public void uploadPDFTC() throws InterruptedException, AWTException {
	new LoginPage(driver,js,as)
	.enterUserName()
	.enterPassword()
	.clickLoginButton()
	.clickAppLauncher()
	.clickViewAll()
	.clickSales()
	.clickOpportunityFromSales()
	.searchOpportunity(searchVal)
	.clickFirstSearchedItem()
	.clickUploadFileInOpportunity()
	.searchAndUploadPDF(filePath)
	.verifyPDFUploaded()
	.clickUploadPDFDone();
	}
}
