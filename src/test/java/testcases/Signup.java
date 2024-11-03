package testcases;

import org.testng.annotations.Test;

public class Signup {
	
	@Test(priority=1,groups= {"regression"},enabled=false)
	public void signupbyEmail() {
		
	System.out.println("SignupEmail");	
		
	}
	
	@Test(priority=2, groups= {"regression"})
	public void SignupbyFacebook() {
		
		System.out.println("this is signup by facebook");
	}
	
	
	@Test(priority=3, groups= {"regression"})
	
	public void SignupByTwitter() {
		
		System.out.println("this is signupbyTwitter");
	}

}
