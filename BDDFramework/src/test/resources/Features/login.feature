Feature: Login page Automation of saucedemo App

  Scenario Outline: Check login is sucessful with valid creds
    Given User is on login page
    When User enters valid "<username>" and "<password>"
    And Clicks on Login Button
    Then User is navegated to Home Page
    And Close the Browser

Examples: 
| username      | password     |
| standard_user | secret_sauce |
