package Practice;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.SigninSucess;
import resources.base;

public class HomePage extends base{
	public WebDriver driver;
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();

	}
	
	@Test(dataProvider="getData")	
	public void basePageNavigation(String Username,String Password) throws IOException
	{		
		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		LoginPage lp=l.getLogin(); 
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		
		lp.getLogin();
		SigninSucess sp= new SigninSucess(driver);
		sp.ValidateLogout();
		

		
		
		
		}

	@AfterTest
	public void teardown()
	{		
		driver.close();

	}

	

	@DataProvider
	public Object[][] getData()
	{
		
		Object[][] data=new Object[2][2];
		//0th row
		data[0][0]="yk20aug@gmail.com";
		data[0][1]="Iloveindia@25";
		
		//1st row
		data[1][0]="gupta19gaurav@gmail.com";
		data[1][1]="Reset@1234";
	
		
		return data;
		
			
		
	}
	
}
