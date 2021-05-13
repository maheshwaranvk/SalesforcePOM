package testCase;

import baseClass.WrapperClass;
import org.testng.annotations.Test;
import pages.LoginPage;


public class SAL129 extends WrapperClass {

    @Test
    public void createNewPaymentGatewayLogs() throws InterruptedException {

        new LoginPage(driver,js,as)
                .enterUserName()
                .enterPassword()
                .clickLoginButton()
                .clickAppLauncher()
                .clickViewAll()
                .clickPaymentGatewayLogs()
                .clickNewInPaymentGateway()
                .selectInteractionType()
                .selectStatusInPaymentGatewayLogs()
                .selectDateAndTime()
                .clickSaveInPaymentGatewayLogs()
                .verifyPaymentGateway();


    }
}
