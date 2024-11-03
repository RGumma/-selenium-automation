package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethodforExplicitWait {

	public static void main(String[] args) {

		WebDriver driver;
		
		driver = new ChromeDriver();
		public static WebElement waitForVisibilityofElement(WebDriver driver, By Locator, int timeout) {
			
		  WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		  
		  w.until(ExpectedConditions.visibilityOf(waitForVisibilityofElement(Locator));
		  
		  return driver.findElement(Locator);
		  
			
		}
		
		
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver);
					.withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(5))
					.ignoring(NoSuchElemetExceptions.class);
			

		
		
		
		

	}

}
