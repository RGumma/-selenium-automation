package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("https://datatables.net/");

		driver.manage().window().maximize();

		WebElement text = driver.findElement(By.xpath("//div[@id='example_info']"));

		String text1 = text.getText();

		int num = Integer.valueOf(text1.substring(text1.indexOf("f") + 2, text1.indexOf("entries") - 1));

		System.out.println(num);

		for (int i = 1; i <= num; i++) {

			if (i == 7) {

				break;
			}
			String pageno = i + "";
			WebElement no = driver.findElement(By.xpath("//nav[@aria-label='pagination']/button[text()='" + pageno + "']"));
			no.click();
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
			int n = rows.size();

			for (int j = 1; j <= n; j++) {

				String value = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + j + "]")).getText();

				System.out.println(value);

			}

		}

	}

}
