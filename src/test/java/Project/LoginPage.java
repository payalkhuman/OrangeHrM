package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	private By usernameField = By.name("username");
	private By passwordField = By.name("password");
	private By loginButton = By.xpath("//button[@type='submit']");

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	public void usernameField(String username) {
		driver.findElement(usernameField).sendKeys(username);
	}

	public void passwordField(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}

	public void loginButton() {
		driver.findElement(loginButton).click();

	}

}
