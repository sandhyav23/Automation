Feature: Facebook application smoke test automation testscript
Scenario: verify the login functionality with invalid credentials
Given user should be in credential page
When user should enter the email
And user should enter the password
And user should click the login button