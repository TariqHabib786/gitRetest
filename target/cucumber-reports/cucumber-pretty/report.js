$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/SDET_TC.feature");
formatter.feature({
  "line": 1,
  "name": "SDET Test Cases",
  "description": "",
  "id": "sdet-test-cases",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12223810600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on TekSchool page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Click on Test Environment link",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User should see Test Environment page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_TekSchool_page()"
});
formatter.result({
  "duration": 5843090400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_Click_on_Test_Environment_link()"
});
formatter.result({
  "duration": 2266814700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_should_see_Test_Environment_page()"
});
formatter.result({
  "duration": 10826800,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "SDET_006_Execution",
  "description": "",
  "id": "sdet-test-cases;sdet-006-execution",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@SDET_006"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User click on the Cameras",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User should be able to add product in the  Add to Cart",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User is able to remove product from the  Add to Cart",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User fill register form with below information",
  "rows": [
    {
      "cells": [
        "Cameras",
        "SelectQauntity",
        "2"
      ],
      "line": 24
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User click on Shopping Cart menu on top of the page, the list of items added should be displayed and there should be a Red X button for each item",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "TekSchoolScenariosStepDefinitions.user_fill_register_form_with_below_information(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 925478600,
  "status": "passed"
});
});