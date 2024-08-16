package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Test_03 {

	@BeforeTest
	public void setUp() {
		System.out.println("Set Up");
	}

	@AfterTest
	public void teardown() {
		System.out.println("Tear down");
	}

	@Test
	public void loginTest() {
		System.out.println("test1");
	}

	@Test
	public void loginTest2() {
		System.out.println("test2");
	}

	@Test
	public void loginTest3() {
		System.out.println("test3");
	}

	@BeforeMethod(description="Connecting to Data Base")
	public void connectDataBase() {
		System.out.println("connect to get some data");
	}

	@AfterMethod(description="close connection from Data Base")
	public void closeConnection() {
		System.out.println("data is already precessed");
	}


}
