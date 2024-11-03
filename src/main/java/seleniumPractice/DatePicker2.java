5package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		List<WebElement>dates =driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		
		for(WebElement date: dates) {
			
			String value= date.getText();
			
			if(value.equals("4")){
				
				date.click();
			}
			
		}
		
		
		
		
		

		
		
	}

}
