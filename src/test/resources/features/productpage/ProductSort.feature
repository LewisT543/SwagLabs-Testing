@product
Feature: Sorting products

  Background: I am logged in
    Given I am on the Product page

  Scenario: Clicking the Name (A to Z) SORT will order the items in ascending alphabetical order
    Given The SORT drop down list is expanded
    When I click Name A TO Z
    Then The items will be ordered in ascending alphabetical order

  Scenario: Clicking the Name (Z to A) SORT will order the items in descending alphabetical order
    Given The SORT drop down list is expanded
    When I click Name Z to A
    Then The items will be ordered in descending alphabetical order

  Scenario: Clicking the Price (low to high) SORT will order the items in ascending price order
    Given The SORT drop down list is expanded
    When I click Price low to high
    Then The items will be ordered in ascending price order

  Scenario: Clicking the Price (high to low) SORT will order the items in descending price order
    Given The SORT drop down list is expanded
    When I click Price high to low
    Then The items will be ordered in descending price order