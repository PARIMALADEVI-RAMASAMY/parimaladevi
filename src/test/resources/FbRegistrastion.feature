Feature: To validate the account creation of fb application

Background:
Given to launch the chrome browser anad maximize window

Scenario: To validate the valid username and invalid password
When To launch url of the facebook application
And to pass valid username in email field
And To pass invalid password in password field
And To click the login button
And To check whether it navigate to the homepage or not
Then To close browser

Scenario Outline: To validate the positive anad negative combingation of login
When User has to hit the facebook url
And user has to pass the data "<emaildatas>" in email field
And USer has to pass the data"<pasworddatas>" in password field
And user has to click the login button
Then User has to close the browser

Examples:
|emaildatas								|passworddatas|
|seleniuminmakes@gmail.com|7845974977		|
|testing@inmakes.com			|978959				|
|pari471995@gmail.com			|Rampari@143	|

