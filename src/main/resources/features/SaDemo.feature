Feature: Saucedemo scenarios

  Background:
    Given I navigate to Saucedemo
    Then I input username as "standard_user"

  Scenario: Verify Login options without password
    And I click on "Login" button
    Then Verify error message "Epic sadface: Password is required"

  Scenario: Verify Login options password was incorrect
    Then I input password as "1234567"
    And I click on "Login" button
    Then Verify error message "Epic sadface: Username and password do not match any user in this service"

  Scenario: Verify Login options with username and password
    Then I input password as "secret_sauce"
    And I click on "Login" button
    Then Verify "Swag Labs" title

  Scenario: Verify there are total of 6 items on the page
    Then I input password as "secret_sauce"
    And I click on "Login" button
    Then Verify 6 items
    And I click on "Add to cart" button
    And Verify "REMOVE" button
    And I click on "Remove" button
    And Verify "ADD TO CART" button
    Then Verify social media buttons are working

#  Scenario Outline: Verify error message outline
#    Then Verify error message "<Error Message>"
#    Examples:
#      | Error Message                                                             |
#      | Epic sadface: Password is required                                        |
#      | Epic sadface: Username and password do not match any user in this service |