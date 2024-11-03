package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver;

		driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		WebElement slider=driver.findElement(By.xpath("//*[@id='slider-range']/span[1]"));
		
		System.out.println(slider.getSize());
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(slider, 200, 0).build().perform();
		
		Point p= slider.getLocation();
		
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		

	}

}
