package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninSucess {

public WebDriver driver;
	
    By logout = By.cssSelector("a.logout");
	
	
	
	
	
	public SigninSucess(WebDriver driver) {
	
		
		this.driver=driver;
		
	}
	
	public void ValidateLogout()
	{
		 driver.findElement(logout).click();
		 
	}
	
	
		 
	
}
