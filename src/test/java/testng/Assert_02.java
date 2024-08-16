package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_02 {


	@Test(description="Test on assertion")
	public void assertTest() {


		/*Hard Assertion will stop execute codes after finding error, code failure*/


		Assert.assertTrue(true);
		Assert.assertEquals("welcome", "welcome");
		Assert.assertEquals("Selenium", "Selenium");
		System.out.println("Successfully passed");


	}

}
