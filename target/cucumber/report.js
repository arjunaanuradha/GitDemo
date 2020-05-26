$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Search.feature");
formatter.feature({
  "name": "Search and place order for vegetables",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search for items and validate results",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is GreenKart langing page",
  "keyword": "Given "
});
formatter.step({
  "name": "User searches for \u003cName\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "\u003cName\u003e results are displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name"
      ]
    },
    {
      "cells": [
        "Carrot"
      ]
    },
    {
      "cells": [
        "Beans"
      ]
    },
    {
      "cells": [
        "Potato"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search for items and validate results",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is GreenKart langing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.user_is_greenkart_langing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for Carrot",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.user_searches_for(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Carrot results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.results_are_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for items and validate results",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is GreenKart langing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.user_is_greenkart_langing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for Beans",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.user_searches_for(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Beans results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.results_are_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for items and validate results",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is GreenKart langing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.user_is_greenkart_langing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for Potato",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.user_searches_for(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Potato results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.results_are_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});