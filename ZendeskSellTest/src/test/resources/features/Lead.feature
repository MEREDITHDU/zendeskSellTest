@Test @Main
Feature: Lead

  Scenario: Create Lead and change status

    Given I logged into the Zendesk sell web application user: "duheimei@gmail.com" with pass: "Test12345!"
    And I have status "New" available in the Lead Configurations
    And I am in the home page
    When I try to create a new Lead with obligatory fields with First Name: "Julie", Last Name: "Kozminski", Company Name: "ING"
    When I update Lead status from "New" status to some different name
    Then I should see my new status in my added lead page
