package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropdown {

	public static void main(String[] args) {

		/*WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
	

		selectChoice(driver,"choice 1");
	
		//selectChoice(driver, "choice 2" ,"choice 2 1", "choice 2 2 ","choice 6");
		
		//selectChoice(driver, "all");
	
	}
	
	
	public static void selectChoice(WebDriver driver, String...value) {
		
	
		
		List<WebElement>options=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		if(!value[0].equalsIgnoreCase("all")) {
		for(WebElement option: options) {
			
			String val = option.getText();
			
			for(String va:  value) {
			
			  if(val.equals(va)) {
				
				option.click();
			}
		}
	
	}
	
	
} else {
	try {
		
		for(WebElement option: options) {
	
			option.click();
		
		}
		
		
		
	}catch(Exception e) {
		
		System.out.println(e.getMessage());
	}
	
}*/


	
		
	}
	
}
		
		
		
		
		
		
