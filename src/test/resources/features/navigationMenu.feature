@navigate
Feature: sales manager should be able to navigate to menu

  Scenario: Navigating fleet--vehicles
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Fleet, Vehicle
    Then title should be Vehicles

   #this annotation is put in Hooks as well so that we know this scenario is related to database
  Scenario: Navigating Marketing--campaigns
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Marketin, Campaigns
    Then title should be Campaigns

  Scenario: Navigating Activities--Calendar Events
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Activities, Calendar Events
    Then title should be Calendars


