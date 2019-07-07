package stepDefinitions;

import base.BaseAssistance;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import static org.junit.Assert.assertTrue;


/**
 * @author บฺรร
 * @version 1.0
 */
public class LoginSteps extends BaseAssistance {

    
@Given("I logged into the Zendesk sell web application user: {string} with pass: {string}")
public void i_logged_into_the_Zendesk_sell_web_application_user_with_pass(String login, String pass) {   
    assertTrue("User is not logged in",
                loginPage.loginToSell(login, pass)
                .isUserLoggedIn());
}
    /**
     * StepDefinitons for and 
     */
    @And("I am in the home page")
    public void  i_am_in_the_home_page() {
        driver.get(utils.getPropertyData("Browser.Url"));
    }
}
