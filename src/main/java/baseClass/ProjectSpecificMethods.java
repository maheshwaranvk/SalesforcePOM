package baseClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ProjectSpecificMethods extends WrapperClass{

	public ProjectSpecificMethods(RemoteWebDriver driver,JavascriptExecutor js) {
		this.driver=driver;
		this.js=js;
	}
	public void openApplication() {
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
	}
	
	
	public List<String> getNameList() {
		
		List<WebElement> dashBoardNameWe = driver.findElementsByXPath("//table[@role='grid']//tr/following::th//a");
		List<String> dashBoardName = new ArrayList<String>();
		String countString = driver.findElementByXPath("//p[@class='slds-text-body--small result-count-label']//span[@class='countSortedByFilteredBy uiOutputText']").getText().replaceAll("\\D", "");
		int count = Integer.parseInt(countString);
		
		for (int i = 1; i <=count; i++) {
			js.executeScript("arguments[0].scrollIntoView(true);", driver.findElementByXPath("(//table[@role='grid']//tr/following::th//a)["+(i)+"]"));
			dashBoardName.add(driver.findElementByXPath("(//table[@role='grid']//tr/following::th//a)["+(i)+"]").getText().toLowerCase());
			
			if(i==count) {
				String countString2 = driver.findElementByXPath("//p[@class='slds-text-body--small result-count-label']//span[@class='countSortedByFilteredBy uiOutputText']").getText().replaceAll("\\D", "");
				int count2 = Integer.parseInt(countString);
				if(count==count2) {
					break;
				}
				else {
					count = Integer.parseInt(driver.findElementByXPath("//p[@class='slds-text-body--small result-count-label']//span[@class='countSortedByFilteredBy uiOutputText']").getText().replaceAll("\\D", ""));
				}
			}
		}
return dashBoardName;
	}
	
}