package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement frame=driver.findElement(By.cssSelector("frame[src='frame_1.html']"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Rajani");
		
		driver.switchTo().defaultContent();
		
		WebElement frame3=driver.findElement(By.cssSelector("frame[src='frame_3.html']"));
		
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.cssSelector("input[name='mytext3']")).sendKeys("vasisht");
		
		
		
		
		

		
		
	}

}
