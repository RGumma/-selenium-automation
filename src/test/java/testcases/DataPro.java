package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataPro {

	 WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
	   
	}
	
	
	
	@Test(dataProvider="dp")
	
	public void Login(String email, String password) throws InterruptedException {
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
	
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
	
		Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	
	}
	
 @AfterClass
 
 public void tearDown() {
	 
	 driver.quit();
 }
 
 
 @DataProvider(name="dp", indices= {0,1})
 
Object[][] loginData() {
	 
	Object data[][] = {
							
			{"abc@gmail.com", "test123"},
			
			{"xyz@gmail.com", "test123"},
			
			{"data@gmail.com", "wert123"},
		};
	 
	 return data;
 
 
 
 
 
}
 
}
