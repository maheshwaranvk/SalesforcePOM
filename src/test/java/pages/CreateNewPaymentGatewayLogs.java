package pages;

import baseClass.WrapperClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

public class CreateNewPaymentGatewayLogs extends WrapperClass {

    public CreateNewPaymentGatewayLogs(RemoteWebDriver driver, JavascriptExecutor js, SoftAssert as) {
        this.driver=driver;
        this.js=js;
        this.as=as;
    }

    public CreateNewPaymentGatewayLogs selectInteractionType(){
        elementClick("xpath","(//a[@class='select'])[1]");
        elementClick("xpath","//a[@title='Authorization']");
        return this;
    }

    public CreateNewPaymentGatewayLogs selectStatusInPaymentGatewayLogs(){
        elementClick("xpath","(//a[@class='select'])[2]");
        elementClick("xpath","//a[@title='Success']");
        return this;
    }

    public CreateNewPaymentGatewayLogs selectDateAndTime(){
        elementClick("xpath","//a[@class='datePicker-openIcon display']");
        elementClick("xpath","//button[text()='Today']");
        return this;
    }

    public OpenPaymentGatewayLogs clickSaveInPaymentGatewayLogs(){
        elementClick("xpath","//div[@class='button-container-inner slds-float_none']//span[text()='Save']");
        return new OpenPaymentGatewayLogs(as);
    }
}
