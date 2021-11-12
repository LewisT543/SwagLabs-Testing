@overview
Feature: Ensuring Content on the overview page is correct

  Background: I am on the overview page
    Given I am on the Overview page with all items in cart

  Scenario: Navigating to the Sauce Labs Backpack page from overview
    When I click the Backpack link
    Then I will go the Backpack page

  Scenario: Navigating to the Sauce Labs Bike Light page from overview
    When I click the Bike Light link
    Then I will go the Bike Light page

  Scenario: Navigating to the Sauce Labs Backpack page from overview
    When I click the Bolt T-Shirt link
    Then I will go the Bolt T-Shirt page

  Scenario: Navigating to the Sauce Labs Backpack page from overview
    When I click the Fleece Jacket link
    Then I will go the Fleece Jacket page

  Scenario: Navigating to the Sauce Labs Backpack page from overview
    When I click the Onesie link
    Then I will go the Onesie page

  Scenario: Navigating to the Sauce Labs Backpack page from overview
    When I click the Test All The Things T-Shirt link
    Then I will go the Test All The Things T-Shirt page

  Scenario: Checking the Tax is correctly shown
    Then The tax will be eight percent

  Scenario: Checking the total price shown is tax plus item total
    Then The item total will be tax plus item total