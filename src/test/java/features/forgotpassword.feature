Feature: Retreiving the password

Scenario Outline: Positive test validating forgot password
Given Initialize the browser with chrome browser
And Navigate to "http://automationpractice.com/index.php" WebSite
And Click on Signin link in home page to land on  signin Page
And User clicks on Forgot Your Password? link
When User enters "<emailaddress>"
And Click on Retreive Password button to log in
Then Verify that user gets a confirmation message with "A confirmation email has been sent to your address:"
And close browser

Examples:
|emailaddress            |
|yk20aug@gmail.com       |
|gupta19gaurav@gmail.com |

