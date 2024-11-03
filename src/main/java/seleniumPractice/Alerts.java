package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.util.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.getCurrentUrl());
		
		//WebElement alert =driver.findElement(By.xpath("//input[@id='alertbtn']"));
		
		//alert.click();
		
		//WebElement confirm = driver.findElement(By.xpath("//input[@id='confirmbtn']"));
		
		//confirm.click();
		//Alert al=driver.switchTo().alert();
		//System.out.println(al.getText());
		//al.dismiss();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("rajani");
		WebElement confirm = driver.findElement(By.xpath("//input[@id='confirmbtn']"));
		confirm.click();
		Alert al=driver.switchTo().alert();
		
		System.out.println(al.getText());
		al.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
