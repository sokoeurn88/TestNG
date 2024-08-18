package test;

import org.testng.annotations.Test;

public class ITestListener_Demo {
	
	@Test
	public void gotIn() {
		System.out.println("Please come inside.");
	}
	@Test
	public void gotOut() {
		System.out.println("Go out please");
	}

}
