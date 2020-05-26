Feature: Login

#Scenario: Home page default login
#Given User is on landing page
#When User login into application with username and password
#Then Home page is displayed
#And Cards are diplayed

#Scenario: Home page default login
#Given User is on landing page
#When User login into application with "Arjuna" and "1234"
#Then Home page is displayed
#And Cards are diplayed "True"

#Scenario: Home page default login
#Given User is on landing page
#When User login into application with "Chadi" and "4321"
#Then Home page is displayed
#And Cards are diplayed "False"

#Background:
#Given Validate browser
#When Browser is triggered
#Then Check if browser is opened

@Regression
Scenario: Home page default login
Given User is on landing page
When User sign up with following data
| Amalya | 9876 | Amalya@gmail.com | New Zealand | 0226329600 |
Then Home page is displayed
And Cards are diplayed "False"

#@Regression
#Scenario Outline: Home page default login
#Given User is on landing page
#When User login in to application with <Username> and <Password>
#Then Home page is displayed
#And Cards are diplayed "False"
#
#Examples:
#| Username | Password |
#| user1 | pass1 |
#| user2 | pass2 |
#| user3 | pass3 |
#| user4 | pass4 |








