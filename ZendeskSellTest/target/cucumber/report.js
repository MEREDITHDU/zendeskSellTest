$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Lead.feature");
formatter.feature({
  "name": "Lead",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test"
    },
    {
      "name": "@Main"
    }
  ]
});
formatter.scenario({
  "name": "Create Lead and change status",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    },
    {
      "name": "@Main"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged into the Zendesk sell web application user: \"duheimei@gmail.com\" with pass: \"Dql12345!\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_logged_into_the_Zendesk_sell_web_application_user_with_pass(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have status \"New\" available in the Lead Configurations",
  "keyword": "And "
});
formatter.match({
  "location": "LeadSteps.i_have_status_available_in_the_Lead_Configurations(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am in the home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_am_in_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I try to create a new Lead with obligatory fields with First Name: \"Julie\", Last Name: \"Kozminski\", Company Name: \"ING\"",
  "keyword": "When "
});
formatter.match({
  "location": "LeadSteps.i_try_to_create_a_new_Lead_with_obligatory_fields_with_First_Name_Last_Name_Company_Name(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I update Lead status from \"New\" status to some different name",
  "keyword": "When "
});
formatter.match({
  "location": "LeadSteps.i_update_Lead_status_from_status_to_some_different_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see my new status in my added lead page",
  "keyword": "Then "
});
formatter.match({
  "location": "LeadSteps.i_should_see_my_new_status_in_my_added_lead_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});