Feature:Navigating the checkout complete page
  Background: I am logged in
    Given I am on the Checkout Complete page

  Scenario: Clicking the BACK HOME button directs me to the products page
    When I click on the BACK HOME button
    Then I will go to the Products page

  Scenario: Clicking the cart icon directs me to the Cart page
    When I click on the cart icon
    Then I will go to the Cart page