package testcases;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpectionTest {


@Test(expectedExceptions=NoSuchElementException.class)	
public void Test1() {

	WebDriverManager.chromedriver().setup();
	
	WebDriver driver ;
	
	driver= new ChromeDriver();
	
	driver.get("https://omayo.blogspot.com/");
	
  WebElement username =driver.findElement(By.xpath("//form[@name='form1']//input[@type='text1']"));
  
  username.sendKeys("Rajani");
	
	
}

		
		
		

	}


