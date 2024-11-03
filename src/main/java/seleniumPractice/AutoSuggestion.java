package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement auto = driver.findElement(By.id("autocomplete"));
		auto.click();

		auto.sendKeys("den");

		

		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));

		for (WebElement li : list) {

			String value = li.getText();

			if (value.equals("Denmark")) {
				
				li.click();
				Thread.sleep(5000);
			}

		}

		driver.quit();

	}

}
