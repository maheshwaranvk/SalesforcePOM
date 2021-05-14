package testCase;

import java.io.IOException;

import org.testng.annotations.Test;

import baseClass.WrapperClass;
import pages.LoginPage;

public class SAL59 extends WrapperClass{

	@Test
	public void verifySummerPdf() throws IOException {
		new LoginPage(driver,js,as)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickGetStartedFromViewReleaseNotes()
		.selectSummer()
		.clickReleaseNotesPDF()
		.verifySummer20PDF();
		
		as.assertAll();

	}
}
