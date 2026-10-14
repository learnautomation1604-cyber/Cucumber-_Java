Feature: Login
  @SC-1
  Scenario: Possitivelogin
    Given launch the walgreens url
    When User Navigate to the SignIn Page
    And User Emter the Valid Username
    And User Enter the Valid Password
    Then User Verify the Sign Success Page

  Scenario: Negative