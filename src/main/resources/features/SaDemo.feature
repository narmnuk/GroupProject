Feature: Saucedemo scenarios

  Background:
    Given I navigate to Saucedemo
    Then I input username as "standard_user"

  Scenario: Verify Login options without password
    And I click on Login button
    Then Verify error message "Epic sadface: Password is required"

  Scenario: Verify Login options password was incorrect
    Then I input password as "123456"
    And I click on Login button
    Then Verify error message "Epic sadface: Username and password do not match any user in this service"

  Scenario: Verify Login options with username and password
    Then I input password as "secret_sauce"
    And I click on Login button
    Then Verify Swag Labs title