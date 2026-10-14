Feature: e2e
  @SC-1
  Scenario: to place a order to verify order number as guest user
    Given launch the walgreens url
    When User serach the valid product
    And User Verifythe search Results
    And User click the product from SRP
    And User Verify the title from PDP
    And User Add the product to card
    And User fill the shippment details
    And User fill the payment details
    And User Complete the payment
    Then User verified the Order Id

  Scenario: Negative