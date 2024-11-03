package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,800)", "");
		
		List<WebElement>rows=driver.findElements(By.xpath("/table[@id='table1']/tbody/tr"));
		
		int n = rows.size();
		
		for(int r = 1; r<=n; r++) {
			
			String value=  driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+r+"]/td[1]")).getText();
			
			if(value.equals("Manish")) {
				
				
				String age =driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+r+"]/td[2]")).getText();
				
				String place =driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+r+"]/td[3]")).getText();
				
				System.out.println(age);
				
			}
			
		}
		
		
		
		


	}

}
