package stepdefinition;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.ForgotPassword;
import resources.base;

public class ForgotPassword_stepdefinition extends base {
	
	LoginPage lp;
	LandingPage l;
	ForgotPassword fp;


@Given("^Initialize the browser with chrome browser$")
public void initialize_the_browser_with_chrome_browser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver =initializeDriver();
}

@Given("^Navigate to \"([^\"]*)\" WebSite$")
public void navigate_to_WebSite(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.get(arg1);
}

@Given("^Click on Signin link in home page to land on  signin Page$")
public void click_on_Signin_link_in_home_page_to_land_on_signin_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	l=new LandingPage(driver);
	 lp=l.getLogin();
}

@Given("^User clicks on Forgot Your Password\\? link$")
public void user_clicks_on_Forgot_Your_Password_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	ForgotPassword fp= lp.forgotPassword();
}

@When("^User enters \"([^\"]*)\"$")
public void user_enters(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions 
	          fp =new ForgotPassword(driver);
    		  fp.getEmail().sendKeys(arg1);
}

@When("^Click on Retreive Password button to log in$")
public void click_on_Retreive_Password_button_to_log_in() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	fp.Retreive_Password().click();
}

@Then("^Verify that user gets a confirmation message with \"([^\"]*)\"$")
public void verify_that_user_gets_a_confirmation_message_with(String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(arg2);
	
}

@Then("^close browser$")
public void close_browser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.quit();
}
}
