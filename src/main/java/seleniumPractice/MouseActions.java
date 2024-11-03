package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#top");
		
		driver.manage().window().maximize();
		
		 JavascriptExecutor js = (JavascriptExecutor)driver; // using pixel to scroll down the page
		 
		 js.executeScript("window.scrollBy(0,350)", "");
		
		WebElement mouse=driver.findElement(By.xpath("//button[@id='mousehover']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(mouse).perform();
		
		WebElement top = driver.findElement(By.xpath("//a[@href='#top']"));
		
		Thread.sleep(5000);
		
		act.moveToElement(mouse).moveToElement(top).click().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
