Feature: User Login

Scenario: Login with valid credentials

Given user open the testUrl
When user enters valid email address "keetestuser5@gmail.com"
And user enters valid password "Keetestuser@5"
And user clicks on login button
Then user should be logged in successfully

Scenario: Login with invalid credentials

Given user open the testUrl
When user enters invalid email address "2345@gmail.com"
And user enters invalid password "pass2345"
And user clicks on login button
Then user should get warning message

Scenario: Login with valid email and invalid password

Given user open the testUrl
When user enters valid email address "keetestuser5@gmail.com"
And user enters invalid password "pass2345"
And user clicks on login button
Then user should get warning message

Scenario: Login with invalid email and valid password

Given user open the testUrl
When user enters invalid email address "2345@gmail.com"
And user enters valid password "Keetestuser@5"
And user clicks on login button
Then user should get warning message

Scenario: Login with no credentials

Given user open the testUrl
When user enters no credentials
And user clicks on login button
Then user should get warning message