@login
Feature: Login page functionality

  Scenario: I enter an incorrect username
    When I enter the username "incorrect_user"
    And I enter the password "secret_sauce"
    And I click the login button
    Then I should see the error "Epic sadface: Username and password do not match any user in this service"

  Scenario: I enter an incorrect password
    When I enter the username "standard_user"
    And I enter the password "unsecret_sauce"
    And I click the login button
    Then I should see the error "Epic sadface: Username and password do not match any user in this service"

  Scenario: I enter an incorrect username and password
    When I enter the username "incorrect_user"
    And I enter the password "unsecrect_sauce"
    And I click the login button
    Then I should see the error "Epic sadface: Username and password do not match any user in this service"

  Scenario: I enter a blank username
    When I enter the username ""
    And I enter the password "unsecrect_sauce"
    And I click the login button
    Then I should see the error "Epic sadface: Username is required"

  Scenario: I enter a blank password
    When I enter the username "incorrect_user"
    And I enter the password ""
    And I click the login button
    Then I should see the error "Epic sadface: Password is required"

  Scenario: I enter a blank username and password
    When I enter the username ""
    And I enter the password ""
    And I click the login button
    Then I should see the error "Epic sadface: Username is required"

  @navigation @mvp
  Scenario: I enter a correct username and password
    When I enter the username "standard_user"
    And I enter the password "secret_sauce"
    And I click the login button
    Then I should be on the inventory page

  Scenario: I enter a correct username and password for a locked user
    When I enter the username "locked_out_user"
    And I enter the password "secret_sauce"
    And I click the login button
    Then I should see the error "Epic sadface: Sorry, this user has been locked out."

