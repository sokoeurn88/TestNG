package allure_reporting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class Allure_Reports {

	/* to see results in server mode

	go to cammand prompt: allure serve C:\Users\sokoeurn chhay\eclipse-workspace2024Feb\TestNG\allure-results

	Allure Annotation

	-> Description
	-> Severity
	-> Epic
	-> Feature
	-> Story
	-> Step

	Attach Screenshots to the reporting using TestNG Listeners


	*/

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
	}


	@Test(priority=1, description ="verify logo is presence on Home Page")
	@Description("verify home page")
	@Epic("EP001")
	@Feature("Feature1: logo")
	@Story("Story: logo presence")
	@Step("verify logo presence")
	@Severity(SeverityLevel.MINOR)
	public void logoPresent() {
		boolean logo = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).isDisplayed();
		Assert.assertEquals(logo, true);
	}


	@Test(priority=2)
	@Description("verify loginpage")
	@Epic("EP001")
	@Feature("Feature1: login")
	@Story("Story: loging")
	@Step("verify logo presence")
	@Severity(SeverityLevel.BLOCKER)
	public void loginTest() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("pavanoltraining@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Test@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
	}


	@Test(priority=3)
	public void registrationTest() {
		throw new SkipException("Skipping this Test");
	}


	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
