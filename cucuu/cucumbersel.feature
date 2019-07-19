Feature: Login functionality
#Background: Browser Launch
#Given Browser installed
#When user enters AUT URL in browser
#Then app must open

Scenario: Login functionality
|
Given user must be registered
When login using <username> and <password>
|username| |password|
|lalitha| |Password123|
|xyz12| |xyz12| 
Then user must be in home page
#@Login
#Scenario: User Login

#Given user must be registered
#When   user enters credentials and performs login
#Then user must be in the home page
#@Register
#Scenario: User Register
#Given user should should not be logged in
#When   user enters all credentials
#Then Registered successfully
#@Search @Login
#Scenario: User search for a product
#Given user should be logged in
#When user should search for the product
#Then Display the product


