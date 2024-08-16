package testng_listener;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


/*This class and method are not run. They are for listening to another class Login_Test.java*/

public class testng_listener extends TestListenerAdapter {
	/*TestListenerAdapter is predefined class in testng*/

	@Override
	public void onTestStart(ITestResult tr) {
		/*ITestResult is a predefined interace*/
		System.out.println("Test started");

	}

	@Override
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test passed");
	}


	@Override
	public void onTestFailure(ITestResult tr) {
		System.out.println("Test failed");
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		System.out.println("Test skipped");
	}


}
