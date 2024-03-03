//package extent_reports;
//
//import java.io.File;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
//
//public class ExtentReportExample {
//	WebDriver driver = null;
//	public ExtentReports report;
//	public ExtentTest test;
//	String reportPath = new File("").getAbsolutePath().toString().trim() + "/Reports/";
//
//	@BeforeMethod
//	public void beforeMethod() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
//		driver = new ChromeDriver();
//
//		// ***********Extent Report Implementation***********
//		report = new ExtentReports(reportPath + this.getClass().getSimpleName() + ".html", false);
//
//		// Starting the test case for reporting
//		test = report.startTest("Extent Report Example Project");
//
//		// ***********Extent Report Implementation***********
//	}
//
//	@Test
//	public void extentReport() {
//		driver.get("https://www.inviul.com/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		String title = driver.getTitle();
//
//		// Setting Pass Failure Log
//		if (title.contains("Avinash")) {
//			System.out.println(title);
//			test.log(LogStatus.PASS, "Validate title matched for the web page", "Title matched");
//		} else {
//
//			test.log(LogStatus.FAIL, "Validate title matched for the web page", "Title didn't match");
//		}
//
//	}
//
//	@AfterMethod
//	public void afterMethod() {
//		driver.close();
//		driver.quit();
//
//		// Closing the report
//		report.endTest(test);
//		report.flush();
//		report.close();
//	}
//
//}
