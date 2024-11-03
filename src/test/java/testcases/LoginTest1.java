package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import pageobjects.LoginPage1;

public class LoginTest1 extends BaseClass1 {
	
	

	@Test
	public void loginTest() throws Exception {
		
		LoginPage1 lp = new LoginPage1(driver);
		Logg.info("*****Launching the url*****");
        driver.get(baseURL);
        driver.manage().window().maximize();
        Logg.info("*****Logging to the e-banking application*****");
        lp.setUsername(username);
		lp.setPassword(passwordname);
		lp.btnlgnClick();
		
		String actualtile=driver.getTitle();
		
		if(actualtile.equals("Guru99 Bank Manager HomePage")) {
		 Assert.assertTrue(true);
		 Logg.info("Test case is passed");
		 
		}else {
			
			takeScreenchot(driver, "logintest");
			Assert.assertTrue(false);
			Logg.info("Test case is failed");
			
		}
        
		
}
	
}
