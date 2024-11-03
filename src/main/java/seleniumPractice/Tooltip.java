package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		
		WebElement frame =driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		
	   driver.switchTo().frame(frame);
	   
	  WebElement title = driver.findElement(By.cssSelector("#age"));
	  
	   String value = title.getAttribute("title");
	   
	   System.out.println(value);
	   
	   
		
		


	}

}
