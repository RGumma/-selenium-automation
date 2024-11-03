package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {

	public WebDriver driver;

	public LoginPage1(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='uid']")

	WebElement userId;

	@FindBy(xpath = "//input[@name='password']")

	WebElement password;

	@FindBy(xpath = "//input[@name='btnLogin']")

	WebElement login;

	public void setUsername(String userid) {

		userId.sendKeys(userid);

	}

	public void setPassword(String pass) {

		password.sendKeys(pass);
	}

	public void btnlgnClick() {

		login.click();
	}

}
