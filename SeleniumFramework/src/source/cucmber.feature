
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Title of your scenario outline
    Given Logged in with username <name> and password<password>
    When I add product <productName> in cart
    And Checkout <productName> and submit the order
    Then  <>massage is displayed on confirmation.

    Examples: 
      | name  | password | productName
      | name1 |     5 | ZARA COAT

