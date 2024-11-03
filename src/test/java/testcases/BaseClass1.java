package testcases;
import org.apache.logging.log4j.Logger;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utilities.ReadConfig;

public class BaseClass1 {

	ReadConfig config = new ReadConfig(); 
	
	public String baseURL = config.getUrl();
	public String username = config.getUserName();
    public String passwordname = config.getPassword();
    public static WebDriver driver;
    public static Logger Logg;

	@Parameters("browser")
	@BeforeClass
	public void setUP() {

      System.setProperty("webdriver.chrome.driver", config.getChromePath());

	   driver = new ChromeDriver();
	   
	   Logg = LogManager.getLogger(BaseClass1.class);
	 
	  }

	@AfterClass
	public void tearDown() {

		driver.quit();

	}

	
	public void takeScreenchot(WebDriver driver,String fileWithPath) throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(System.getProperty("user.dir")+"/Screenshots/"+fileWithPath+".png");
				
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		
	
	}
		
		
		
	}
	
	

