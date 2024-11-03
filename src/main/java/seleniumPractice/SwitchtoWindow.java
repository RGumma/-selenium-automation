5package seleniumPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchtoWindow {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		String parent = driver.getWindowHandle();

		driver.findElement(By.id("openwindow")).click();

		Set<String> handles = driver.getWindowHandles();
		
		for(String handle:handles) {
			
		   String child = handle;
		   
		   if(!parent.equalsIgnoreCase(child)) {
			   
			   driver.switchTo().window(child);
			   
			   WebElement text =driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[1]/a"));
				
				System.out.println(text.getText());
				
				driver.switchTo().window(parent);
				
				String title =driver.getTitle();
				
				if(title.equals("Practice Page")) {
					
					driver.close();
				}
				
		   }
		
		}
		
		

		/*
		 * List<String>li = new ArrayList(handles);
		 * 
		 * String childid1= li.get(0); String parentid =li.get(1);
		 * 
		 * System.out.println(childid); System.out.println(parentid);
		 * 
		 * driver.switchTo().window(parentid);
		 * 
		 * driver.getTitle(); System.out.println(driver.getTitle());
		 * 
		 * driver.switchTo().window(childid); System.out.println(driver.getTitle())
		 */;

		//Iterator<String> it = handles.iterator();

		/*while (it.hasNext()) {

			String child =it.next();
			
			if(!parent.equalsIgnoreCase(child)) {
				
				driver.switchTo().window(child);
				
				WebElement text =driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[1]/a"));
				
				System.out.println(text.getText());
				
				
			}

		}*/

	}

}
