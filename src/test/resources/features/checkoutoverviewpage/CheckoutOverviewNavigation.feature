@overview @navigation @mvp
Feature: Navigating from the overview page

  Background: I am on the overview page
    Given I am on the Overview page

  Scenario: Clicking the CANCEL button directs me to the CART page
    When I click on the CANCEL button
    Then I will go to the Products page

  Scenario: Clicking the FINISH button directs me to the Complete page
    When I click on the FINISH button
    Then I will go the Complete page

  Scenario: Clicking the cart icon directs me to the Cart page
    When I click on the cart icon
    Then I will go to the Cart page