package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpeningtheLinkNewTab {

	public static void main(String[] args) {
     
		WebDriverManager.chromedriver().setup();

		WebDriver driver;

		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		WebElement basics=driver.findElement(By.xpath("//a[normalize-space()='Amazon Basics']"));
		
		Actions act = new Actions(driver);
		
		String tab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		
		act.moveToElement(basics).contextClick(basics).sendKeys(tab).build().perform();



	}

}
