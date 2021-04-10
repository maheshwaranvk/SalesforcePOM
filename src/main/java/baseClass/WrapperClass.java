package baseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WrapperClass{
	
	public RemoteWebDriver driver;
	String browser = "chrome";
	public JavascriptExecutor js;
	public WebDriverWait wait;
	public SoftAssert as = new SoftAssert();
	
//--------------------------CONTRUCTOR--------------------------------------------------------------------------------------------------------	

	
//--------------------------OPEN BROWSER--------------------------------------------------------------------------------------------------------	
	@BeforeMethod
	public void launchBrowser() {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();

			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--disable-notifications");
			driver = new FirefoxDriver(options);
		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		js = (JavascriptExecutor) driver;
		driver.manage().deleteAllCookies();
		new ProjectSpecificMethods(driver,js).openApplication();
	}

//--------------------------LOCATE ELEMENT--------------------------------------------------------------------------------------------------------	
	public WebElement locateElement(String loc , String val) {
		if(loc.equalsIgnoreCase("id")) {
			waitForIt(loc, val);
			return driver.findElementById(val);
		}
		
		else if(loc.equalsIgnoreCase("name")) {
			waitForIt(loc, val);
			return driver.findElementByName(val);
		}
		
		else if(loc.equalsIgnoreCase("xpath")) {
			waitForIt(loc, val);
			return driver.findElementByXPath(val);
		}
		
		else if(loc.equalsIgnoreCase("class")) {
			waitForIt(loc, val);
			return driver.findElementByClassName(val);
		}
		return null;

	}
	
//--------------------------LOCATE ELEMENTS--------------------------------------------------------------------------------------------------------
	public List<WebElement> locateElements(String loc , String val) {
		if(loc.equalsIgnoreCase("id")) {
			waitForIt(loc, val);
			return driver.findElementsById(val);
		}
		
		else if(loc.equalsIgnoreCase("name")) {
			waitForIt(loc, val);
			return driver.findElementsByName(val);
		}
		
		else if(loc.equalsIgnoreCase("xpath")) {
			waitForIt(loc, val);
			return driver.findElementsByXPath(val);
		}
		
		else if(loc.equalsIgnoreCase("class")) {
			waitForIt(loc, val);
			return driver.findElementsByClassName(val);
		}
		return null;

	}
//--------------------------CLICK--------------------------------------------------------------------------------------------------------	

	public void elementClick(String loc, String val) {
		
		locateElement(loc,val).click();

	}
	
//--------------------------JAVA SCRITPT CLICK--------------------------------------------------------------------------------------------------------	

	
	public void javaScriptClick(WebElement we) {

		js.executeScript("arguments[0].click()", we);

	}

//--------------------------EXPLICIT WAIT--------------------------------------------------------------------------------------------------------

	public void waitForIt(String loc, String we) {

		if (loc.equalsIgnoreCase("id")) {
			wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(we)));
		}

		else if (loc.equalsIgnoreCase("name")) {
			wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(we)));
		} else if (loc.equalsIgnoreCase("xpath")) {
			wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we)));
		} else if (loc.equalsIgnoreCase("class")) {
			wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(we)));
		}
	}
	
//--------------------------WINDOW HANDLES--------------------------------------------------------------------------------------------------------
	public void getwindows(int windowIndex) {
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>windowHandlesList = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windowHandlesList.get(windowIndex));
	}
	
//--------------------------READ PDF--------------------------------------------------------------------------------------------------------

public boolean readPDF(String pdfurl , String verifyText) throws IOException {
		URL url = new URL(pdfurl);
		
		InputStream openStream = url.openStream();
		BufferedInputStream fileParse = new BufferedInputStream(openStream);
		
		PDDocument document = null;
		document = PDDocument.load(fileParse);
		
		String text = new PDFTextStripper().getText(document);
		
		return text.contains(verifyText);

	}

//--------------------------UPLOAD A FILE--------------------------------------------------------------------------------------------------------

public void uploadFile(String filePath) throws AWTException, InterruptedException {
	StringSelection ss = new StringSelection(filePath);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	
	Robot robo = new Robot();
	
	robo.setAutoDelay(2000);
	
	robo.keyPress(KeyEvent.VK_CONTROL);
	robo.keyPress(KeyEvent.VK_V);
	
	robo.keyRelease(KeyEvent.VK_CONTROL);
	robo.keyRelease(KeyEvent.VK_V);
	
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(3000);
}
}

