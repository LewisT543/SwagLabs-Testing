Feature: Adding items from the inventory to the cart

  Background: I am logged in
    Given I am on the Inventory page

  Scenario: Adding the Sauce Labs Backpack to the CART
    When I click on the Backpack ADD TO CART button
    Then The Backpack ADD TO CART button should change to REMOVE

  Scenario: Adding the Sauce Labs Bolt T-Shirt to the CART
    When I click on the Bolt T-Shirt ADD TO CART button
    Then The Bolt T-Shirt ADD TO CART button should change to REMOVE

  Scenario: Adding the Sauce Labs Onesie to the CART
    When I click on the Onesie ADD TO CART button
    Then The Onsie ADD TO CART button should change to REMOVE

  Scenario: Adding the Sauce Labs Bike Light to the CART
    When I click on the Bike Light ADD TO CART button
    Then The Bike Light ADD TO CART button should change to REMOVE

  Scenario: Adding the Sauce Labs Fleece Jacket to the CART
    When I click on the Fleece Jacket ADD TO CART button
    Then The Fleece Jacket ADD TO CART button should change to REMOVE

  Scenario: Adding the Test.allTheThings() T-Shirt (Red) to the CART
    When I click on the test all things T-Shirt ADD TO CART button
    Then The test all things T-Shirt ADD TO CART button should change to REMOVE

  Scenario: Increasing CART counter by 1 via Sauce Labs Backpack ADD TO CART button
    When I click on the Backpack ADD TO CART button
    Then The CART counter should be 1

  Scenario: Increasing CART counter by 1 via Sauce Labs Bolt T-Shirt ADD TO CART button
    When I click on the Bolt T-Shirt ADD TO CART button
    Then The CART counter should be 1

  Scenario: Increasing CART counter by 1 via Sauce Labs Onesie ADD TO CART button
    When I click on the Onesie ADD TO CART button
    Then The CART counter should be 1

  Scenario: Increasing CART counter by 1 via Sauce Labs Bike Light ADD TO CART button
    When I click on the Bike Light ADD TO CART button
    Then The CART counter should be 1

  Scenario: Increasing CART counter by 1 via Sauce Labs Fleece Jarket ADD TO CART button
    When I click on the Fleece Jacket ADD TO CART button
    Then The CART counter should be 1

  Scenario: Increasing CART counter by 1 via Test.allThings() T-Shirt (Red) ADD TO CART button
    When I click on the test all things T-Shirt ADD TO CART button
    Then The CART counter should be 1