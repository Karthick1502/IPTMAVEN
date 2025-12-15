Feature: Naukri Web Application Testing

Scenario Outline:
: Login functionality
Given User must launch the browser and url
When User must enter "karthickponniyinselvam@gmail.com" in username field
And User must enter "Toffee@1502" in password field
Then User must click the login button
And It should navigate to Home page "PonniyinSelvam"
Example:
username|pass
karthick|7892
prema|92398



