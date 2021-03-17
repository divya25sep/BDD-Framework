package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

	
	public WebDriver driver;
	
	By email=By.xpath("//input[@id='email']");
	By password=By.xpath("//input[@id='passwd']");
	By login=By.xpath("//button[@id='SubmitLogin' and @name='SubmitLogin']");
	By forgotPassword = By.linkText("Forgot your password?");
	
	
	
	
	public LoginPage(WebDriver driver) {
	
		
		this.driver=driver;
		
	}



public ForgotPassword forgotPassword()
{
	driver.findElement(forgotPassword).click();
	return new ForgotPassword(driver);
	
}
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public SigninSucess getLogin()
	{
		driver.findElement(login).click();
		SigninSucess sp=new SigninSucess(driver);
		return sp;
	}
	
	
	
}
