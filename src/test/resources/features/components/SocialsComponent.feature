Feature: Navigating with socials links

  Background: I am on the cart page
    Given I am on the cart page

  Scenario: I should see a twitter social button at the bottom of the screen
    When I go to the bottom of the page
    Then I should see a twitter social button

  Scenario: I should see a facebook social button at the bottom of the screen
    When I go to the bottom of the page
    Then I should see a facebook social button

  Scenario: I should see a linkedin social button at the bottom of the screen
    When I go to the bottom of the page
    Then I should see a linkedin social button

  Scenario: Clicking the twitter social button should take me to twitter
    When I click on the twitter social button
    Then I should be taken to twitter

  Scenario: Clicking the facebook social button should take me to facebook
    When I click on the facebook social button
    Then I should be taken to facebook

  Scenario: Clicking the linkedin social button should take me to linkedin
    When I click on the linkedin social button
    Then I should be taken to linkedin