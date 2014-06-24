Feature: World Of John Home Test

  Scenario: Ensure Contact Page Link Works
    Given I Navigate to the World of John Home Page
    When  I Click the Contact Button
    And   I Click on the Breakfast Button
    Then  The Contact Page will Appear
    Then  Close the Browser
