Feature: Website Login

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid username and password
    And clicks the login button
    Then the user should be logged in successfully
    Given the user adds the backpack to the cart
    When the user clicks on the cart
    And the user clicks on the finish button
    Then the user should see the purchase confirmation