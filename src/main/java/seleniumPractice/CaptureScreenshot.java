package seleniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src =ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File(".\\Screenshots\\amazon.png");
		
		FileUtils.copyFile(src, target);
		
		//screenshot of portion of the page introduced from 4 
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)", "");
		
        WebElement section=  driver.findElement(By.cssSelector("#CardInstanceT5sh3C8WZnSbzh1RyqK3Mg"));
        
       File src1= section.getScreenshotAs(OutputType.FILE);
       
       File tar = new File(".\\Screenshots\\portion.png");
       
       FileUtils.copyFile(src1, tar);
       
       
       
		

	}

}
