package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {

	
	public WebDriver driver;
	
	By email=By.xpath("//input[@id='email']");
	By Retreivepassword =By.xpath("//span[normalize-space()='Retrieve Password']");
	By successmessage = By.xpath("//p[@class='alert alert-success'])");
	
	
	
	
	public ForgotPassword(WebDriver driver) {
		
	this.driver=driver;	
	
	}


	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement Retreive_Password()
	{
		return driver.findElement(Retreivepassword);
	}
	
	public String Success_Message()
	{
		return driver.findElement(successmessage).getText();
	}
	

	
	
}
