Feature: Text can be entered into the checkout page

  Background: I am on the checkout page
    Given I am on the Checkout page

  Scenario: Inputting text into the First Name field
    When I input "firstname" into the First Name field
    Then I should see "firstname" in the First Name field

  Scenario: Inputting text into the Last Name field
    When I input "lastname" into the Last Name field
    Then I should see "lastname" in the Last Name field

  Scenario: Inputting text into the Postcode field
    When I input "postcode" into the Postcode field
    Then I should see "postcode" in the Postcode field