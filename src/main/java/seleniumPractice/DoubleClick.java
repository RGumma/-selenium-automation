package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement doub =driver.findElement(By.xpath("//button[text()='Double-click me']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(doub).build().perform();
		
		WebElement text =driver.findElement(By.xpath("//p[text()='Hello World']"));
		
		String value=text.getText();
		
		if(value.equals("Hello World")) {
			
			
			System.out.println("Text is validated");
			
			}else{
				
				System.out.println("Text is not validated");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
