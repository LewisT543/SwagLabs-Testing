@cart @mvp
Feature: Removing products from cart

  Background: I am logged in
    Given I am on the Product page
    And All the products have been added to the cart

  Scenario: Removing the Sauce Labs Backpack from the CART
    When I click on the Backpack REMOVE button
    Then The Backpack should be removed from the CART

  Scenario: Removing the Sauce Labs Bolt T-Shirt from the CART
    When I click on the Bolt T-Shirt REMOVE button
    Then The Bolt T-Shirt ADD TO CART should be removed from the CART

  Scenario: Removing the Sauce Labs Onesie from the CART
    When I click on the Onesie REMOVE button
    Then The Onesie should be removed from the CART

  Scenario: Removing the Sauce Labs Bike Light from the CART
    When I click on the Bike Light REMOVE button
    Then The Bike Light should be removed from the CART

  Scenario: Removing the Sauce Labs Fleece Jacket from the CART
    When I click on the Fleece Jacket REMOVE button
    Then The Fleece Jacket should be removed from the CART

  Scenario: Removing the Test.allTheThings() T-Shirt (Red) from the CART
    When I click on the test all things T-Shirt REMOVE button
    Then The test all things T-Shirt should be removed from the CART