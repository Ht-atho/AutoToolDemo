$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/MyTest.feature");
formatter.feature({
  "name": "As a user, i want to login into the Mektoube",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login fail with incorrect email",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test02"
    }
  ]
});
formatter.step({
  "name": "Go to \u0027https://mektoube.fr/login\u0027 url",
  "keyword": "Given "
});
formatter.match({
  "location": "DefinitionSteps.goToUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Insert \u0027yassine_yes3\u0027 into the Email field",
  "keyword": "When "
});
formatter.match({
  "location": "DefinitionSteps.insertAIntoTheEmailField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Insert \u0027Mektoubi2017\u0027 into the Password field",
  "keyword": "When "
});
formatter.match({
  "location": "DefinitionSteps.insertAIntoThePasswordField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login button",
  "keyword": "When "
});
formatter.match({
  "location": "DefinitionSteps.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Show error-box : Incorrect username or password",
  "keyword": "Then "
});
formatter.match({
  "location": "DefinitionSteps.error_box()"
});
formatter.result({
  "status": "passed"
});
});