package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	

	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
	public void setup(String br, String url) throws InterruptedException{
		if(br.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}else if(br.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
		}
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
	}
	
	
	@Test(priority=1)
	
	public void testLogo() {
		
	boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	
	Assert.assertEquals(status, true);
	
	}
	
	@Test (priority=2)
	public void testAppUrl() {
		
	 
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		
		
	}
	
	@Test (priority=3, dependsOnMethods= {"testAppUrl"})
	public void testHomePageTitle() {
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");//Hard assertions
		
		Assert.assertTrue(true);
		
		Assert.assertEquals(1, 1);
		
		
	}
	
	@AfterClass 
	
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	

}
