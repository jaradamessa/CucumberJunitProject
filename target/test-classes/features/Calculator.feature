Feature: This feature will help to develop a calculator

  Background: 
    Given I have the calculator

  Scenario: To add two numbers
    When I add 11 and 4
    Then I should get the result as 15

  Scenario: To substract two numbers
    When I sub 12 and 4
    Then I should get the result as 8

  Scenario Outline: To add two number with multiple data set
    When I add <num1> and <num2>
    Then I should get the result as <result>

    Examples: 
      | num1 | num2 | result |
      |    7 |    9 |     16 |
      |   12 |   13 |     25 |
      |   -8 |   18 |     10 |

  Scenario: To add multiple numbers
    When I add multiple numbers
      |  4 |
      |  6 |
      | 13 |
      | 16 |
      | 10 |
    Then I should get the result as 49

  Scenario: To calculate the total bill of all the itmes
    When I buy items with given price
      | Coffee | 50 |
      | Burger | 80 |
    Then I should get result as 130

  Scenario: To calculate the total bill of all items with different quantity
    When I buy items with given price and quantitiy
      | Coffee    | 2 | 50 |
      | Burger    | 3 | 80 |
      | Ice cream | 1 | 40 |
    Then I should get the result as 380
