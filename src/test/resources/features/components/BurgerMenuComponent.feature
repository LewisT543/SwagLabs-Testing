Feature: Burger menu functionality

  Background: I am on the products page
    Given I am on the Product page

  Scenario: Burger menu should be present
    Then I should see a burger menu

  Scenario: Burger menu all items button is present
    When I click on the burger menu button
    Then I should see a burger menu all items button

  Scenario: Burger menu about button is present
    When I click on the burger menu button
    Then I should see a burger menu about button

  Scenario: Burger menu logout button is present
    When I click on the burger menu button
    Then I should see a burger menu logout button

  Scenario: Burger menu exit button is present
    When I click on the burger menu button
    Then I should see a burger menu exit button

  Scenario: Clicking the all items button in burger menu should take me to inventory page
    When I click on the burger menu button
    And I click on the burger menu all items button
    Then I should be redirected to the products page

  Scenario: Clicking the about button in burger menu should take me to about page
    When I click on the burger menu button
    And I click on the burger menu about button
    Then I should be redirected to the about page

  Scenario: Clicking the logout button in burger menu should take me to the login page
    When I click on the burger menu button
    And I click on the burger menu logout button
    Then I should be redirected to the login page
