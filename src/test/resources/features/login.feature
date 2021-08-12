@login     # if you put top of feature all scenarios run
Feature: User should be able to login

  #We use Background, When we have common steps for all different scenarios in one feature file,
  Background:
    When the user is on the login page

  @driver
  Scenario: Login as a driver
    When the user enters the driver information
    Then the user should be able to login
  @sales_manager @VYT-123
  Scenario: Login as a sales manager
    When the user enters the sales manager information
    Then the user should be able to login
  @store_manager @smoke
  Scenario: Login as a store manager
    When the user enters the store manager information
    Then  the user should be able to login


