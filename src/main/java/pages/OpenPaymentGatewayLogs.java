package pages;

import baseClass.WrapperClass;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

public class OpenPaymentGatewayLogs extends WrapperClass {


    public OpenPaymentGatewayLogs(SoftAssert as) {
        this.as=as;
        waitForIt("xpath","//div[text()='Payment Gateway Log']");
    }

    public OpenPaymentGatewayLogs verifyPaymentGateway() throws InterruptedException {
        Thread.sleep(5000);
        String xpath = locateElement("xpath", "//div[text()='Payment Gateway Log']").getText();
        as.assertTrue(xpath.contains("Payment Gateway Log"));
        as.assertAll();
        return this;
    }

}
