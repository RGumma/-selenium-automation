package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectspecificcheckbox {

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input'][@type='checkbox']"));
		
		 int totalcheckbox=checkboxes.size();
		
		 for(int i=0; i>totalcheckbox; i++) {
			 
			 if(i<2) {
			 
			 checkboxes.get(i).click();
		 }
			
		}	
			
			//String value = checkbox.getAttribute("value");
			
			
			/*if(value != null && (value.equals("sunday") || value.equals("monday") || value.equals("tuesday"))){
				
				checkbox.click();
			}*/
		
		
	}
}
