package applitools_UI_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Applitools_UI_Test {
	
	WebDriver driver;
	
	
	
	@Test
	public void setUp() {
		WebDriverManager.chromedriver().setup();	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//applitoos class
		Eyes eyes = new Eyes();
		eyes.setApiKey("0Ys2b2t104DXUo48bkOAQqmQbhvL4KhCaQZDXml7JKIKM110");
		eyes.open(driver, "Hello", "Hello world test1");
		
		
		driver.get("https://applitools.com/helloworld/?diff2");
		eyes.checkWindow("Home Page");
		
		eyes.close();

		
		
	}
	
}
