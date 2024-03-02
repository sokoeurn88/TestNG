package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Soft_Assert_05 {
	WebDriver driver;
	
	
	@Test
	public void verifyTitle() {
		
		String expectedTitle = "123 Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedText = "Search";
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		System.out.println(driver.getTitle());
		
		String actualTitle = driver.getTitle();
		String actualText = driver.findElement(By.xpath("//*[@id='gh-btn']")).getAttribute("value");
		
		
		/*Soft Assert will not stop execution if code failed*/
		SoftAssert softAssert = new SoftAssert();		
		
		/*Hard Assert will stop the execution if code failed*/
//		Assert.assertEquals(expectedTitle, actualTitle);
		softAssert.assertEquals(expectedTitle, actualTitle);

		
		Assert.assertEquals(actualText, expectedText, "verify search text");
		System.out.println("Test is completed");
		
		softAssert.assertAll(); /*will help to report if any failure in test case, then the execution still continue to the end*/
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
	
	
	
}
