Feature: Login page functionality

  Background: Starting from the login page
    Given: I am on the login page

  Scenario: I enter an incorrect username
    When: I enter an incorrect username
    Then: I should see the error "Epic sadface: Username and password do not match any user in this service"

  Scenario: I enter an incorrect password
    When: I enter an incorrect password
    Then: I should see the error "Epic sadface: Username and password do not match any user in this service"

  Scenario: I enter an incorrect username and password
    When: I enter an incorrect username and password
    Then: I should see the error "Epic sadface: Username and password do not match any user in this service"

  Scenario: I enter a blank username
    When: I enter a blank username
    Then: I should see the error "Epic sadface: Username is required"

  Scenario: I enter a blank password
    When: I enter a blank password
    Then: I should see the error "Epic sadface: Password is required"

  Scenario: I enter a blank username and password
    When: I enter a blank username and password
    Then: I should see the error "Epic sadface: Username is required"

  Scenario: I enter a correct username and password
    When: I enter a correct username and password
    Then: I should be logged in and taken to /inventory.html

