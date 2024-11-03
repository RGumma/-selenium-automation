package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {


	@Test 
	
	public void test() {
		
		//Assert.assertNotEquals(123, 123);
		
		//Assert.assertTrue(1==3);
		
		
	}
		@Test
      public void HardAssertions() {
    	  
    	System.out.println("Rajani");
    	
    	Assert.assertEquals(1, 1);
    	
    	System.out.println("Testing");
    	
    	
    }

		@Test
		public void softAssertions() {
			
			SoftAssert s = new SoftAssert();
			
			s.assertEquals(1, 2);
			
			System.out.println("rajani");
			
			s.assertAll();
			
			
			
		}
		
		

	}


