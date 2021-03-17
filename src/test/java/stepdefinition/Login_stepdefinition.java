package stepdefinition;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.SigninSucess;
import resources.base;

public class Login_stepdefinition extends base{
	
	LoginPage lp;
	LandingPage l;
	SigninSucess sp;

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver =initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Given("^Click on Signin link in home page to land on Secure sign in Page$")
	public void click_on_Signin_link_in_home_page_to_land_on_Secure_sign_in_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 l=new LandingPage(driver);
		 lp=l.getLogin(); 
		    
	}
    	
	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_something_and_something(String username, String password) throws Throwable {
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);		
		
    }
	

    @When("^Click on Signin button to log in$")
    public void click_on_signin_button_to_log_in() throws Throwable {
    	lp.getLogin();
    }
	

	@Then("^Verify that user is succesfully logged in$")
	public void verify_that_user_is_succesfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.getTitle(), "My account - My Store");
	}
	
	 @Then("^Click on Signout button to log out$")
	    public void click_on_signout_button_to_log_out() throws Throwable {
		 sp= new SigninSucess(driver);
		 sp.ValidateLogout();
	    }

	@Then("^close browsers$")
	public void close_browsers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.quit();
	}
}

	


	

	

