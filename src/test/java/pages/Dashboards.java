package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.ProjectSpecificMethods;
import baseClass.WrapperClass;

public class Dashboards extends WrapperClass{

	public List<String> unSortedNameList = new ArrayList<String>();
	public List<String> sortednameList = new ArrayList<String>();
	
	public Dashboards(RemoteWebDriver driver,JavascriptExecutor js, SoftAssert as) {
		this.driver=driver;
		this.js=js;
		this.as=as;
		waitForIt("xpath","//li[@class='slds-breadcrumb__item entityName']/*[text()='Dashboards']");
	}
	
	public CreateNewDashboard clickNewDashboard() {
		javaScriptClick(driver.findElementByXPath("//div[text()='New Dashboard']"));
		return new CreateNewDashboard(driver,js,as);
	}
		
	public Dashboards collectionsNonSortDashBoardList() {
		unSortedNameList = new ProjectSpecificMethods(driver,js).getNameList();
		Collections.sort(unSortedNameList);
		return this;
	}
	
	public Dashboards clickDashboardNameSort() throws InterruptedException {
		javaScriptClick(driver.findElementByXPath("//table[@role='grid']//tr//th//span//span[text()='Dashboard Name']/parent::a"));
		Thread.sleep(3000);
		return this;
	}
	
	public Dashboards sortDashBoardList() {
		sortednameList = new ProjectSpecificMethods(driver,js).getNameList();
		return this;
	}
	
	public Dashboards compareDashboardNames() {
		as.assertTrue(sortednameList.equals(unSortedNameList));
		return this;
	}
	
	
}
