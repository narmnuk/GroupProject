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

  Scenario: Verify total of 6 items
    Then I input password as "secret_sauce"
    And I click on "Login" button
    Then Verify 6 items

  Scenario: Verify After click add to cart button equal REMOVE
    Then I input password as "secret_sauce"
    And I click on "Login" button
    And I click on "Add to cart" button
    Then Verify "REMOVE" button

  Scenario: Verify After click remove button equal ADD TO CART
    Then I input password as "secret_sauce"
    And I click on "Login" button
    And I click on "Add to cart" button
    And I click on "Remove" button
    Then Verify "ADD TO CART" button

  Scenario: Verify social media buttons are working
    Then I input password as "secret_sauce"
    And I click on "Login" button
    Then Verify social media buttons are working

#  Scenario Outline: Verify error message outline
#    Then Verify error message "<Error Message>"
#    Examples:
#      | Error Message                                                             |
#      | Epic sadface: Password is required                                        |
#      | Epic sadface: Username and password do not match any user in this service |