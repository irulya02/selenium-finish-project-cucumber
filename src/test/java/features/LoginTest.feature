Feature: Login
  @success_login
  Scenario: Success login
    Given User opens the page Login
    When User fills input username "irina81"
    Then User fills input password "I19811202a!"
    And User clicks on button Login
    Then The page Profile is displayed

  @invalid_password
    Scenario: Invalid password
      Given User opens the page Login
      When User fills input username "irina81"
      Then User fills input password "111111111"
      And User clicks on button Login
      Then Error massage is displayed
    And Error massage with text "Invalid username or password!" is displayed
