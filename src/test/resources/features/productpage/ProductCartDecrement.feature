Feature: Cart badge decrements once

  Background: I am logged in
    Given I am on the Product page

  Scenario: Removing a product from a full cart
    Given The cart is full
    When I click a REMOVE button
    Then The cart badge should be five