Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "http://automationpractice.com/index.php" Site
And Click on Signin link in home page to land on Secure sign in Page
When User enters "<username>" and "<password>"
And Click on Signin button to log in
Then Verify that user is succesfully logged in
And Click on Signout button to log out
And close browsers

Examples:
 |username                |password     |
 |yk20aug@gmail.com       |Iloveindia@25|
 |gupta19gaurav@gmail.com |Reset@1234   |
