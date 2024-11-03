package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CapturetheText {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement button= driver.findElement(By.xpath("//input[@id='Email']"));
		String name =button.getAttribute("value");
		System.out.println(name);
		
		
	
		
		
		
		
		
		
		
		

		
		

	}

}
