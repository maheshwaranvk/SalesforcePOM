package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.*;

public class AppLauncher extends WrapperClass{

	
	public AppLauncher(RemoteWebDriver driver, JavascriptExecutor js, SoftAssert as) {
		this.driver=driver;
		this.js=js;
		this.as=as;
		waitForIt("xpath","//h2[text()='App Launcher']");
	}
	
	public Opportunities clickOppurtunities() {
		javaScriptClick(driver.findElementByXPath("//p[text()='Opportunities']"));
		return new Opportunities(driver,js,as);
	}
	
	public Dashboards clickDashboard() {
		javaScriptClick(driver.findElementByXPath("//p[text()='Dashboards']"));
		return new Dashboards(driver,js,as);
	}
	
	public Sales clickSales() {
		elementClick("xpath", "//p[text()='Sales']");
		return new Sales(driver,js,as);
	}
}
