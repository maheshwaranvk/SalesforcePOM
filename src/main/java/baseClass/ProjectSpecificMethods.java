package baseClass;

import org.openqa.selenium.remote.RemoteWebDriver;

public class ProjectSpecificMethods extends WrapperClass{

	public ProjectSpecificMethods(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public void openApplication() {
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
	}
	
}