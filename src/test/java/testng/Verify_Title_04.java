package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Title_04 {
	WebDriver driver;
	
	
	@Test
	public void verifyTitle() {
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		System.out.println(driver.getTitle());
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
	
	
	
}
