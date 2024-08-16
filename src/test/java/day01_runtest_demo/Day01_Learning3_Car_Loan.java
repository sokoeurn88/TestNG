package day01_runtest_demo;

import org.testng.annotations.Test;

public class Day01_Learning3_Car_Loan {

//	public static void main(String[] args) {
//		
//		System.out.println("Hello TestNG");
//	}
	
	
	@Test(enabled=false)
	public void runTestUsingTestNG() {
		System.out.println("Hello TestNG outside Java Compiler");
	}
	
	@Test
	public void runTestUsingTestNG1() {
		System.out.println("Hello TestNG outside Java Compiler");
	}
	

}
