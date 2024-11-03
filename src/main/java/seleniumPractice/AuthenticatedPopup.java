package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticatedPopup {

	public static void main(String[] args) {

		//Authenticated pop up
		//driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
		
		
		//to disable the permission pop ups we need to use chromeoptions
		
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		
		driver = new ChromeDriver(options);
		
		
		
		
		
		
		
		

	}

}
