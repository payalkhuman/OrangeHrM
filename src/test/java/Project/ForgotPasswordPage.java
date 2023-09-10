package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import OrangeHRM_Project.TC01_Login_page;

public class ForgotPasswordPage {

	     WebDriver driver;
	     By usernameTextBox = By.name("username");
	     By resetButton = By.xpath("//button[@type='submit']");
	     By cancelButton = By.xpath("//button[@type='button']");
	   // private By warningMessage = By.cssSelector("div.fadable");

	    public ForgotPasswordPage(WebDriver driver){
	        this.driver = driver;
	    }

	    public void setUsername(String username){
	        driver.findElement(usernameTextBox).sendKeys(username);
	    }

	    public ForgotPasswordPage clickResetButton(){
	        driver.findElement(resetButton).click();
	        return new ForgotPasswordPage(driver);
	    }

	    public TC01_Login_page clickCancelButton(){
	        driver.findElement(cancelButton).click();
	        return new TC01_Login_page(driver);
	    }

//	    public boolean isMessageWarningDisplayed(){
//	        return driver.findElement(warningMessage).isDisplayed();
//	    }
//
//	    public String getWarningMessage(){
//	        return driver.findElement(warningMessage).getText();
//	    }
}
