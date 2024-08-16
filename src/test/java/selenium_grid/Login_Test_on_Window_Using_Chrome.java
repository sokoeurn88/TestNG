//package selenium_grid;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Platform;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;


// /*Code in this class will not work/*



//
//public class Login_Test_on_Window_Using_Chrome {
//	private static final String DesiredCapabilities = null;
//	WebDriver driver;
//
//	@Test(priority=1)
//	void setup() throws MalformedURLException {
//
//		String nodeURL = "http://192.168.1.88:5555";
//
//
//
//		DesiredCapabilities cap = DesiredCapabilities.chrome();
//		cap.setBrowserName("chrome");
//		cap.setPlatform(Platform.WIN11);
//
//
////		WebDriverManager.chromedriver().setup();
////		driver = new ChromeDriver();
//
//		WebDriverManager.chromedriver().setup();
//		driver = new RemoteWebDriver(new URL(nodeURL), cap);
//		driver.manage().window().maximize();
//	}
//
//	@Test(priority=2)
//	void login() {
//		driver.get("http://practice.automationtesting.in/my-account/");
//		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("pavanoltraining");
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Test@selenium123");
//		driver.findElement(By.xpath("//*[@name='login']")).click();
//		String text = driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/div/p[1]")).getText();
//		System.out.println(text);
//	}
//
//	@Test(priority=3)
//	void tearDown() {
//		driver.quit();
//	}
//
//}
