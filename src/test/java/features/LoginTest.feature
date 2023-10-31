Feature: Login
  Scenario: Success login
    Given User opens the page Login
   When User fills input username "irina81"
    Then User fills input password "I19811202a!"
    And User clicks on button Login
    #Then The page Profile is displayed