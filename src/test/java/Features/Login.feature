@SignInFeature
Feature: Sign In

  #TC4 (Test Case 4)
  @TC4_SignIn_scenario
  Scenario: SignIn to automationpractice.com
    Given I click on Sign in link
    When i enter the username
    And i enter the password
    Then i click on SignIn button