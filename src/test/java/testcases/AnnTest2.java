package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnTest2 {

	
@BeforeClass
	
	public void Login() {
	
	System.out.println("Login to the application ");
}
	
	
	@Test(priority=1)
	
	public void Search() {
		
		System.out.println("I am searching 2");
	}
	
	@Test(priority=2)
	
	public void AdvSearch() {
		
		System.out.println("I am in advance search");
	}
	
	
	@AfterClass
	
	public void Logout() {
		
		System.out.println("I am loginig out of the application");
	}
	
	
	
	
	
	
}
