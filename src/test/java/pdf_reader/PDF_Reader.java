package pdf_reader;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




/*this code is not working. Need more implementation. Use as a model*/



public class PDF_Reader {
	private static final PDDocument PDDocument = null;
	WebDriver driver;
	String url = "chrome-extension://efaidnbmnnnibpcajpcglclefindmkaj/https://www.adobe.com/support/products/enterprise/knowledgecenter/media/c4611_sample_explain.pdf";

	/*if you download the file to your local machine, open pdf file as browser*/
	String url1 = "chrome-extension://efaidnbmnnnibpcajpcglclefindmkaj/file:///C:/Users/sokoeurn%20chhay/Downloads/c4611_sample_explain.pdf";


	@BeforeTest
	public void setup() {

		/*if you want to run in headless mode*/
//		ChromeOptions co = new ChromeOptions();
//		co.setHeadless(true);
//		co.addArguments("--incognito");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@Test
	public void readPDF() throws IOException {

		URL pdfURL = new URL(url);

		InputStream ip = pdfURL.openStream();

		BufferedInputStream bf = new BufferedInputStream(ip);

		/*PDDocument is main control in PDF file*/
		PDDocument pdfDocument = PDDocument /*.load(bf)*/;

		int pageCount = pdfDocument.getNumberOfPages();

		System.out.println(pageCount);

		Assert.assertEquals(pageCount, 4);


		/*getting page content*/
		PDFTextStripper pdfStripper = new PDFTextStripper();

		String pdfText = pdfStripper.getText(pdfDocument);
		System.out.println(pdfText);


		Assert.assertTrue(pdfText.contains("PDF BOOKMARKS SAMPLE"));
		Assert.assertTrue(pdfText.contains("LOAN BALANCE"));
		Assert.assertTrue(pdfText.contains("CREDIT AVAILABLE"));
		Assert.assertTrue(pdfText.contains("TOTAL BALANCE"));

		/*Set page numebr and get text*/
		pdfStripper.setStartPage(3);

		String pdfText1 = pdfStripper.getText(pdfDocument);
		System.out.println(pdfText1);

		Assert.assertTrue(pdfText1.contains("abc.dat"));

	}









	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
