@product
Feature: Go to individual product page via link

  Background: I am logged in
    Given I am on the Product page

  Scenario: Navigating to the Sauce Labs Backpack page via link
    When I click the Backpack link
    Then I will go the Backpack page

  Scenario: Navigating to the Sauce Labs Bolt T-Shirt page via link
    When I click the Bolt T-Shirt link
    Then I will go the Bolt T-Shirt page

  Scenario: Navigating to the Sauce Labs Onesie page via link
    When I click the Onesie link
    Then I will go the Onesie page

  Scenario: Navigating to the Sauce Labs Bike Light page via link
    When I click the Bike Light link
    Then I will go the Bike Light page

  Scenario: Navigating to the Sauce Labs Fleece Jacket page via link
    When I click the Fleece Jacket link
    Then I will go the Fleece Jacket page

  Scenario: Navigating to the Test.allTheThings() T-Shirt (Red) page via link
    When I click the Test All The Things T-Shirt link
    Then I will go the Test All The Things T-Shirt page