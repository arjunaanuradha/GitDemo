Feature: Account

@Smoke
Scenario: Home page default login
Given User is on landing page
When User login into application with "Arjuna" and "1234"
Then Home page is displayed
And Cards are diplayed "True"

@Smoke
Scenario: Home page default login
Given User is on landing page
When User login into application with "Chadi" and "4321"
Then Home page is displayed
And Cards are diplayed "False"