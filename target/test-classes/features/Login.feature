Feature: This feature will be used to login into Simplilearn Website

  Background: 
    Given I have launched the app URL
    And I click on the Login link

  Scenario: Validate Login Successful scenario
    When I enter the username
    And I enter the password
    And I click on the login button
    Then I should land to the home page

  Scenario Outline: Validate Login failure scenario using data parameters
    When I enter the username as "Abc@xyz.com"
    And I enter the password as "Abc@1234"
    And I click on the login button
    Then I should get the error message as "The email or password you have entered is invalid."

    Examples: 
      | UserName    | Password | ErrorMsg                                           |
      | Abc@xyz.com | Abc@1234 | The email or password you have entered is invalid. |
      | Pqr@xyz.com | Pqr@1234 | The email or password you have entered is invalid. |

  Scenario: Validate the other login options on the screen
    Then I should see below login options on the screen
      | Google   |
      | Facebook |
      | Linkedin |
      | Apple    |
