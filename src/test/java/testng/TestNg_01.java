package testng;

import org.testng.annotations.Test;

public class TestNg_01 {

	@Test(priority=2, description="Login to a website")
	public void loginTest() {
		System.out.println("Mr Chhay");
	}

	@Test(priority=1, description="set name first before login sample")
	public void setFirstName() {
		System.out.println("give name is Sokoeurn");
	}

}
