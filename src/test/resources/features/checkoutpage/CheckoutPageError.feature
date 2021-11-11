Feature: Errors that occur on the checkout page

  Background: I am on the checkout page
    Given I am on the Checkout page

  Scenario: Clicking the CONTINUE button gives me an error because the First Name Field is empty
    When I enter the lastname "lastname"
    And I enter the postcode "postcode"
    And I click on the CONTINUE button
    Then I should get an error message "Error: First Name is required"

  Scenario: Clicking the CONTINUE button gives me an error because the Last Name field is empty
    When I enter the firstname "firstname"
    And I enter the postcode "postcode"
    And I click on the CONTINUE button
    Then I should get an error message "Error: Last Name is required"

  Scenario: Clicking the CONTINUE button gives me an error because the Postal Code field is empty
    When I enter the firstname "firstname"
    And I enter the lastname "lastname"
    And I click on the CONTINUE button
    Then I should get an error message "Error: Postal Code is required"

  Scenario: Clicking the CONTINUE button gives me an error icon because the a First Name field is empty
    When I enter the lastname "lastname"
    And I enter the postcode "postcode"
    And I click on the CONTINUE button
    Then I should see an error icon next to the First Name field

  Scenario: Clicking the CONTINUE button gives me an error icon because the a Last Name field is empty
    When I enter the firstname "firstname"
    And I enter the postcode "postcode"
    And I click on the CONTINUE button
    Then I should see an error icon next to the Last Name field

  Scenario: Clicking the CONTINUE button gives me an error icon because the a Postcode field is empty
    When I enter the firstname "firstname"
    And I enter the lastname "lastname"
    And I click on the CONTINUE button
    Then I should see an error icon next to the Postcode field