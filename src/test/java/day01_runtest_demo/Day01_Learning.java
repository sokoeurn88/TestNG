package day01_runtest_demo;

import org.testng.annotations.Test;

public class Day01_Learning {

//	public static void main(String[] args) {
//		
//		System.out.println("Hello TestNG");
//	}
	
	
	@Test(timeOut=4000)
	public void runTestUsingTestNG() {
		System.out.println("Hello TestNG outside Java Compiler");
	}
	@Test
	public void runTestUsingTestNG1() {
		System.out.println("Hello TestNG outside Java Compiler");
	}
	

}
