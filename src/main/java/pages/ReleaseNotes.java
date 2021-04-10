package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.WrapperClass;

public class ReleaseNotes extends WrapperClass{

	public ReleaseNotes(RemoteWebDriver driver,JavascriptExecutor js,SoftAssert as) {
		this.driver=driver;
		this.js=js;
		this.as=as;
		getwindows(1);
	}
	
	public ReleaseNotes selectSummer() {
		elementClick("id", "select-input");
		elementClick("xpath", "//span[contains(@title,'Summer') and contains(@title,'20')]");
		return this;
	}
	
	public Summer20PDF clickReleaseNotesPDF() {
		elementClick("xpath", "//a[@class='link slds-button slds-button_neutral' and contains(text(),'PDF')]");
		return new Summer20PDF(driver,js,as);
	}
}
