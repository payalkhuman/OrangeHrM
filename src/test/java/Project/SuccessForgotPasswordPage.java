package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessForgotPasswordPage {

	
	

	     WebDriver driver;
	     By successParagraph = By.xpath("//div[@class='orangehrm-card-container']/h6");
	   // private By successHeader = By.xpath("//div[@class='head']/h1");

	    public SuccessForgotPasswordPage(WebDriver driver){
	        this.driver = driver;
	    }

	    public String getSuccessMessage(){
	       return driver.findElement(successParagraph).getText();
	    }
//	    public String getSuccessHeader(){
//	        return driver.findElement(successHeader).getText();
}
//	   