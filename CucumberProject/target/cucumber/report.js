$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "id": "login",
  "tags": [
    {
      "name": "@login",
      "line": 1
    }
  ],
  "description": "",
  "name": "Login",
  "keyword": "Feature",
  "line": 2
});
formatter.scenario({
  "id": "login;valid-username-and-password",
  "description": "",
  "name": "Valid username and password",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "navigate to \"http://www.betfair.com\"",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "valid username and password is entered",
  "keyword": "When ",
  "line": 6,
  "rows": [
    {
      "cells": [
        "userName",
        "passWord"
      ],
      "line": 7
    },
    {
      "cells": [
        "apitestuk1",
        "password03"
      ],
      "line": 8
    },
    {
      "cells": [
        "apitestuk1",
        "password03"
      ],
      "line": 9
    },
    {
      "cells": [
        "apitestuk1",
        "password03"
      ],
      "line": 10
    },
    {
      "cells": [
        "apitestuk1",
        "password03"
      ],
      "line": 11
    }
  ]
});
formatter.step({
  "name": "user should be successfully logged in",
  "keyword": "Then ",
  "line": 12
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.betfair.com",
      "offset": 13
    }
  ],
  "location": "LoginSteps.navigate_to(String)"
});
formatter.result({
  "duration": 10308801902,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.valid_username_and_password_is_entered(DataTable)"
});
formatter.result({
  "duration": 2411953808,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_should_be_successfully_logged_in()"
});
formatter.result({
  "duration": 5957803134,
  "status": "passed"
});
});