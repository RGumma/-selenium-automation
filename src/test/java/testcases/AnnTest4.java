package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AnnTest4 {
	
	
	
	@AfterTest
	
	public void At() {
		
		System.out.println("After test ");
	
	}
	
	@Test
	
	public void Test4() {
		
		System.out.println("Test 4");
	}

}
