@checkout
Feature: Navigating from the checkout page

  Background: I am on the checkout page
    Given I am on the Checkout page

  Scenario: Clicking the CANCEL button directs me to the CART page
    When I click on the CANCEL button
    Then I will go to the Cart page

  Scenario: Clicking the CONTINUE button directs me to the Overview page
    Given I have inputted the correct details
    When I click on the CONTINUE button
    Then I will go the Overview page

  Scenario: Clicking the cart icon directs me to the Cart page
    When I click on the cart icon
    Then I will go to the Cart page