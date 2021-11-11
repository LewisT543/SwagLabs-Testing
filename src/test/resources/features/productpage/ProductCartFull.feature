Feature: Cart is full

  Background: I am logged in
    Given I am on the Product page

  Scenario: Adding all the products to the cart
    When I click all the ADD TO CART buttons
    Then The cart badge should be six