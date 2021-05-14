package pages;

import baseClass.WrapperClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

public class PaymentGatewayLogs extends WrapperClass {

    public PaymentGatewayLogs(RemoteWebDriver driver, JavascriptExecutor js, SoftAssert as) {
        this.driver=driver;
        this.js=js;
        this.as=as;
    }

    public CreateNewPaymentGatewayLogs clickNewInPaymentGateway(){
        elementClick("xpath","//div[text()='New']");
        return new CreateNewPaymentGatewayLogs(driver,js,as);
    }

}
