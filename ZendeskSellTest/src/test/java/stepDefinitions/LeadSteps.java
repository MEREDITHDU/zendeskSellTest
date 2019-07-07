package stepDefinitions;

import base.BaseAssistance;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobject.ConfigPage;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author บฺรร
 */
public class LeadSteps extends BaseAssistance {

    private String expectedLeadLink;
    private String newRandomLeadStatusContext;
  
    /**
     * @param firstName
     * @param lastName
     * @param companyName
     */
    @When("I try to create a new Lead with obligatory fields with First Name: {string}, Last Name: {string}, Company Name: {string}")
public void i_try_to_create_a_new_Lead_with_obligatory_fields_with_First_Name_Last_Name_Company_Name(String firstName, String lastName, String companyName) {
    
    String expectedLeadTitle = firstName + " " + lastName + " " + companyName;

        dashboardPage.openAddNewLead();
        assertEquals("Added lead is not visible", expectedLeadTitle,addLeadPage.fillBasicLead(firstName, lastName, companyName)
                .saveAndView()
                .getAddedLeadTitle());

        expectedLeadLink = driver.getCurrentUrl();

        assertEquals("Lead status should be 'New' by default", "New", viewLeadPage.getLeadStatus());
}

    @Then("I should see my new status in my added lead page")
public void i_should_see_my_new_status_in_my_added_lead_page() {
        driver.get(expectedLeadLink);
        assertEquals("The new status is not visible", newRandomLeadStatusContext, viewLeadPage.getLeadStatus());
}

    /**
     * @param oldStatus
     */
    @When("I update Lead status from {string} status to some different name")
public void i_update_Lead_status_from_status_to_some_different_name(String oldStatus) {
    dashboardPage.openSettings()
                .navigateToSettingsSubPage(ConfigPage.SettingsSubPages.LEADS);

        newRandomLeadStatusContext = utils.getRandomUUID();
        leadsSettings.updateLeadStatusName(oldStatus, newRandomLeadStatusContext);
}

    /**
     * @param status
     */
    @Given("I have status {string} available in the Lead Configurations")
public void i_have_status_available_in_the_Lead_Configurations(String status) {
     dashboardPage.openSettings()
                .navigateToSettingsSubPage(ConfigPage.SettingsSubPages.LEADS);

        if(!leadsSettings.isStatusAvailable(status)) {      
            leadsSettings.updateFirstLeadStatusName(status);
        }
}

}
