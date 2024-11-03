package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));

		int colssize = cols.size();

		System.out.println(colssize);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));

		int rowsize = rows.size();

		System.out.println(rowsize);

		for (int i = 1; i <= rowsize; i++) {

		for (int j = 1; j <= colssize; j++) {

				String value = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();

				System.out.println(value);

			}

		}

	}

}
