Feature: Go to the cart page via the cart icon

Background: I am logged in
Given I am on the Product page

  Scenario: Navigating to the cart page via the cart icon
    When I click the cart icon
    Then I will go to the Cart page