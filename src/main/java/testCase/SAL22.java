package testCase;

import org.testng.annotations.Test;

import baseClass.WrapperClass;
import pages.LoginPage;

public class SAL22 extends WrapperClass{

	@Test
	public void sortDashboard() throws InterruptedException {
		new LoginPage(driver,js,as)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickAppLauncher()
		.clickViewAll()
		.clickDashboard()
		.collectionsNonSortDashBoardList()
		.clickDashboardNameSort()
		.sortDashBoardList()
		.compareDashboardNames();
		
		as.assertAll();
	}
}
