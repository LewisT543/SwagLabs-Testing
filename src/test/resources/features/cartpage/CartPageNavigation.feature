@cart @navigation
Feature: Navigating the cart page
  Background: I am logged in
    Given I am on the cart page

  Scenario: Clicking the CONTINUE SHOPPING button directs me to the products page
    When I click on the CONTINUE SHOPPING button
    Then I will go to the Products page

  Scenario: Clicking the CHECKOUT button directs me to the checkout page
    When I click on the CHECKOUT button
    Then I will go to the Checkout page