package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");

		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		WebElement next = driver.findElement(By.xpath("//a[@title='Next']"));
		
		while(true) {
			WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
			String monthname = month.getText();
			System.out.println(monthname);
			WebElement date = driver.findElement(By.xpath("//span[text()='2024']"));
			String datename = date.getText();
			System.out.println(datename);
			
			if (monthname.equals("December") && datename.equals("2024")){
				
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[4]/a")).click();
				break;

			} else {
               
				try {
            
            	next.click();  
               
               }catch(Exception e) {
            	  
       
            	   driver.findElement(By.xpath("//a[@title='Next']")).click();
            	   
               }
			}

		}

	}

}
