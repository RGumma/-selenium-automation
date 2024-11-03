package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		/*List<WebElement> links=driver.findElements(By.xpath("//a"));
		
		for(WebElement link:links) {
			
			System.out.println(link.getAttribute("href"));
		
		}*/
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,300)", "");

		
		
		
       WebElement link =driver.findElement(By.linkText("Advertise Your Products"));
       
       link.click();
	}

}
