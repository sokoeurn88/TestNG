package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions_06 {


	@Test
	public void login() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); /*ctrl + shift + o ->to add Library*/
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com");

		WebElement motor = driver.findElement(By.xpath("//*[@id='vl-flyout-nav']/ul/li[3]/a"));
		Assert.assertEquals(motor.isDisplayed(), true);
		System.out.println("Motor Text is found");

		driver.close();
	}



}
