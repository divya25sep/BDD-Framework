package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	public WebDriver driver;
	
	By signin=By.cssSelector("a.login");
	
	By NavBar=By.cssSelector("div.container");
	
	
	
	
	
	public LandingPage(WebDriver driver) {
		
		
		this.driver=driver;
		
	}




	public LoginPage getLogin()
	{
		 driver.findElement(signin).click();
		 LoginPage lp=new LoginPage(driver);
		 return lp;
		 
		 
		 
		 
	}
	
	
	public WebElement getNavigationBar()
	{
		return driver.findElement(NavBar);
	}
	
	
}
