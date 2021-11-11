Feature: Remove changed to add to cart

  Background: I am logged in
    Given I am on the Product page

  Scenario: Removing a product from a full cart
    Given The cart is full
    When I click the Sauce Labs Backpack REMOVE button
    Then The Sauce Labs Backpack REMOVE button should change to a ADD TO CART button