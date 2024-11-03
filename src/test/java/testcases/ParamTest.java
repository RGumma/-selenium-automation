package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParamTest {
	
	@Test(priority=1)
	public void login() {
	
		
		System.out.println("This is login Test");
		
		Assert.assertTrue(false);
	}
	
	@Test(priority=2,enabled=true,alwaysRun= true,dependsOnMethods= {"login"})
	public void logout() {
		
		System.out.println("This is log out Test");
	}
	
	
	

}
