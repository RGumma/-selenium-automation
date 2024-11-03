package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiselect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver; 
		driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement multi=driver.findElement(By.id("multiselect1"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		WebElement element= wait.until(ExpectedConditions.visibilityOf(multi));
		 Select se = new Select(multi);
		
		se.selectByVisibleText("Volvo");
		se.selectByVisibleText("Swift");
		se.selectByVisibleText("Hyundai");
		se.deselectByValue("volvox");
		List <WebElement>options=se.getAllSelectedOptions();
		
		for(WebElement option: options) {
			
			System.out.println(option.getText());
		}
		
		Thread.sleep(5000);
		driver.quit();

	}

}
