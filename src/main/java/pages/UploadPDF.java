package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.WrapperClass;

public class UploadPDF extends WrapperClass{
	
	public UploadPDF(RemoteWebDriver driver,JavascriptExecutor js,SoftAssert as) {
		this.driver=driver;
		this.js=js;
		this.as=as;
	}
	
	
	public UploadPDF searchAndUploadPDF(String filePath) throws InterruptedException, AWTException {
		uploadFile(filePath);
		return this;
	}
	
	public UploadPDF verifyPDFUploaded() {
		waitForIt("xpath","//div[@class='slds-grid slds-grid--vertical-align-center slds-p-around--small']//*[@data-key='success']");
		return this;
	}
	
	public OpenOpportunity clickUploadPDFDone() {
		elementClick("xpath", "//div[@class='footerCmps ']//*[text()='Done']");
		return new OpenOpportunity(driver,js,as);
	}
}
