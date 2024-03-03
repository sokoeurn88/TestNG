package testng_listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_Test {
	
	
	@Test
	void loginByEmail() {
		System.out.println("Log in by email");
		Assert.assertEquals("chhay", "chhay");
	}
	
	@Test/*(enabled=false)*/ /*if you do want to run test case*/
	void loginByIcloud() {
		System.out.println("Log in by icloud");
		Assert.assertEquals("sokoeurn", "sokoeurn");
	}

	@Test
	void loginByFacebook() {
		System.out.println("Log in by facebook");
		Assert.assertEquals("chhay", "sarom");
	}
	
}
