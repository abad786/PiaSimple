#Author: mohd.abadrhmn@gamil.com

@test
Feature: Customer ID verification

  Scenario Outline: Verify the Customer ID is saved correctly
    When I enter customer id as "<ID>"
    And I click on Sign Up Button
    And I dismiss the alert of environment description by pressing OK button.
    And I click the up-right corner gear button to go to Settings page.
    Then I verify the Customer ID is saved correctly with "<ID>"
    And I click on change customer ID button
    And I click on cancel button

    Examples: 
      | ID  |
      | 101 |
