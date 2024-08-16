package extent_reports;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Extent_Reports {

	public WebDriver driver;

	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;

	@BeforeTest
	public void setExtent() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/myReport.html");

		//set title of the report
		htmlReporter.config().setDocumentTitle("Automation Report");

		//Name of the report
		htmlReporter.config().setReportName("Functional Report");

		htmlReporter.config().setTheme(Theme.DARK);

		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("Hostname", "localHost");
		extent.setSystemInfo("OS", "Window11");
		extent.setSystemInfo("Tester name", "Sokoeurn");
		extent.setSystemInfo("Browser", "Chrome");

	}

	@AfterTest
	public void endReport() {
		extent.flush();
	}

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\TestNG\\Drivers\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
	}

	@Test
	public void noCommerceTitleTest() {
		test = extent.createTest("noCommerceTitleTest");

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "noCommerce demo store");
	}

	@Test
	public void noCommerceLogoTest() {
		test = extent.createTest("noCommerceLogoTest");

		Boolean status = driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[2]")).isDisplayed();
		Assert.assertTrue(status);
	}

	@Test
	public void noCommerceLoginTest() {
		test = extent.createTest("noCommerceLogoTest");
		Assert.assertTrue(false);
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {

		if(result.getStatus()== ITestResult.FAILURE) {

			//Add name to extent report
			test.log(Status.FAIL, "Test case failed is" + result.getName());

			//to add error or exception
			test.log(Status.FAIL, "Test case failed is" + result.getThrowable());

			String screenshotPath = Extent_Reports.getScreenshot(driver, result.getName());

			test.addScreenCaptureFromPath(screenshotPath);
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Test Case Skipped is"+ result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "test case passed is "+ result.getName());
		}

	}



	// util method for screenshot
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {

		String dateName = new SimpleDateForamt("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		//after execution, you could see a folder "FailedTestScreenshots" under src folder
		String destination = System.getProperty("user.dir")+"/Screenshots/"+screenshotName + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}





































}
