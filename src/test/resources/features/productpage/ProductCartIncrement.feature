@product
Feature: Cart badge increments once

  Background: I am logged in
    Given I am on the Product page

  Scenario: Adding the Sauce Labs Backpack to the cart
    When I click the Sauce Labs Backpack ADD TO CART button
    Then The cart icon should increment once

  Scenario: Adding the Sauce Labs Bolt T-Shirt to the cart
    When I click the Sauce Labs Bolt T-Shirt ADD TO CART button
    Then The cart icon should increment once

  Scenario: Adding the Sauce Labs Onesie to the cart
    When I click the Sauce Labs Onesie ADD TO CART button
    Then The cart icon should increment once

  Scenario: Adding the Sauce Labs Bike Light to the cart
    When I click the Sauce Labs Bike Light ADD TO CART button
    Then The cart icon should increment once

  Scenario: Adding the Sauce Labs Fleece Jacket to the cart
    When I click the Sauce Labs Fleece Jacket ADD TO CART button
    Then The cart icon should increment once

  Scenario: Adding the Test.allTheThings() T-Shirt (Red) to the cart
    When I click the Test All The Things T-Shirt ADD TO CART button
    Then The cart icon should increment once