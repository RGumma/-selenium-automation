package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
	  
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
        WebElement dropDown = driver.findElement(By.name("dropdown-class-example"));
        
        Select se = new Select(dropDown);
        
       // se.selectByValue("option1");
        se.selectByVisibleText("Option3");
        //se.selectByIndex(3);
      WebElement selected= se.getFirstSelectedOption();
      System.out.println(selected.getText());
         
       List<WebElement> options= se.getOptions();
      
       for(WebElement option: options) {
    	   
    	  String value =option.getText();
    	  
    	  if(value.equals("Option1")) {
    		  
    		 option.click();
    	  }
       }
        
       
       driver.quit(); 
        
        
        
		
		
		
		
		
		

	}

}
