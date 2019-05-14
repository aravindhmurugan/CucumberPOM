$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Selenium/Workspace/CucumberPOM/src/main/java/com/qa/features/freecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM application test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate free crm home page test",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on the home page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is on the new contacts page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_is_on_home_page()"
});
formatter.result({
  "duration": 11663820010,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 37478035,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 3645008359,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_the_home_page()"
});
formatter.result({
  "duration": 71111423,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_the_new_contacts_page()"
});
formatter.result({
  "duration": 4467768807,
  "status": "passed"
});
});