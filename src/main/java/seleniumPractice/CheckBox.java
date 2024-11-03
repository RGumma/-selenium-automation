package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		// Thread.sleep(5000);

		List<WebElement> checkboxes = driver.findElements(By.xpath("//label/input[@type='checkbox']"));
		
		 System.out.println(checkboxes.get(1).getText());
		
		

		//for (WebElement checkbox : checkboxes) {

			//String value = checkbox.getText();

			//System.out.println(value)*/

		}

	}


