@product @navigation
Feature: Go to individual product page via image

  Background: I am logged in
    Given I am on the Product page

  Scenario: Navigating to the Sauce Labs Backpack page via image
    When I click the Backpack image
    Then I will go the Backpack page

  Scenario: Navigating to the Sauce Labs Bolt T-Shirt page via image
    When I click the Bolt T-Shirt image
    Then I will go the Bolt T-Shirt page

  Scenario: Navigating to the Sauce Labs Onesie page via image
    When I click the Onesie image
    Then I will go the Onesie page

  Scenario: Navigating to the Sauce Labs Bike Light page via image
    When I click the Bike Light image
    Then I will go the Bike Light page

  Scenario: Navigating to the Sauce Labs Fleece Jacket page via image
    When I click the Fleece Jacket image
    Then I will go the Fleece Jacket page

  Scenario: Navigating to the Test.allTheThings() T-Shirt (Red) page via image
    When I click the Test All The Things T-Shirt image
    Then I will go the Test All The Things T-Shirt page