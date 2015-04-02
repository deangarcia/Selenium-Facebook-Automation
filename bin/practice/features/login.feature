Feature: Test login try and focus on explicit and implicit waits 

  Scenario: Test login and imediately try and click on a link
    Given I navigated to facebook
    When I input my user name
    And I input my password
    And I login
    And I click on csulb boxing link
    And I click on smorgasport link
    Then close out browser

