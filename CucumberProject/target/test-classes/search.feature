@login
Feature: Login

  Scenario: Valid username and password
    Given navigate to "http://www.betfair.com"
    When valid username and password is entered
      | userName   | passWord   |
      | apitestuk1 | password03 |
      | apitestuk1 | password03 |
      | apitestuk1 | password03 |
      | apitestuk1 | password03 |
    Then user should be successfully logged in
