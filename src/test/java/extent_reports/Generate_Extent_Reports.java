//package extent_reports;
//
//import java.io.File;
//
//import org.testng.Assert;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//
//public class Generate_Extent_Reports {
//
//	/*Specify the location of the report*/
//	ExtentReports extent;
//
//	/*What details should be populated in the report*/
//	ExtentTest test;
//
//	@Test
//	public void startReport() {
//		extent = new ExtentReports(System.getProperty("users.dir")+"/test-output/myownreport.html", true);
////		extent = new ExtentReports("C:/Users/sokoeurn chhay/eclipse-workspace2024Feb/TestNG/test-output/myownreport.html"), true);
//		extent.addSystemInfo("Host Name", "LocalHost");
//		extent.addSystemInfo("Environment", "QA");
//		extent.addSystemInfo("User Name", "Sokouern Sarom");
//		extent.loadConfig(new File(System.getProperty("users.dir")+"\\extent-config.xml"));
//	}
//
//
//	@Test
//	public void demoReportPass() {
//		test = extent.startTest("demoReportsPass");
//		Assert.assertTrue(true);
//		test.log(logStatus.PASS, "Assert Pass as condition is true");
//	}
//
//	@Test
//	public void demoReportFail() {
//		test = extent.startTest("demoReportsFail");
//		Assert.assertTrue(false);
//		test.log(logStatus.FAIL, "Assert Fail as condition is fail");
//	}
//
//
//	@AfterMethod
//	public void getResult(ITestResult result) {
//		if(result.getStatus()==ITestResult.FAILURE) {
//			test.log(LogStatus.Fail, result.getThrowable());
//		}
//		extent.endTest(test);
//	}
//
//
//	@AfterTest
//	public void endReport() {
//		extent.flush(); /*clear report*/
//	}
//
//
//
//
//}
