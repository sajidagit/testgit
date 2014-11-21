@login
Feature: Login

  #Scenario: Valid username and password
   # Given navigate to "http://www.betfair.com"
    #When valid username and password is entered
     # | userName   | passWord   |
      #| apitestuk1 | password03 |
    #Then user should be successfully logged in

  Scenario Outline : Valid username and password
    Given navigate to "http://www.betfair.com"
    When valid username and password is entered
      | userName   | passWord   |
      | <username> | <password> |
    Then user should see this message "<message>"

  Examples:
    | username   | password   | message    |
    | apitestuk1 | password03 | successful |

