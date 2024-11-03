package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckingtheStatus {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(5000);
		
		WebElement button=driver.findElement(By.xpath("//button[@id='but2']"));
		
	    System.out.println(button.isEnabled());
	    
	    
	    
	    
	    
	    
		
		
		
		


		

	}

}
