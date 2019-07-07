package base;

import environment.EnvironmentSetup;
import pageobject.DashboardPage;
import pageobject.Leads.AddLeadPage;
import pageobject.Leads.LeadsConfigs;
import pageobject.Leads.ViewLeadPage;
import pageobject.LoginPage;
import pageobject.ConfigPage;

/**
 * @author Qilin
 * @version 1.0
 */
public class BaseAssistance extends EnvironmentSetup {

    public static AddLeadPage addLeadPage;
    private static Base base;
    public static DashboardPage dashboardPage;
    public static LeadsConfigs leadsSettings;
    public static LoginPage loginPage;
    private static ConfigPage configPage;
    public static Property utils;
    public static ViewLeadPage viewLeadPage;

    protected static void initPages() {
        addLeadPage = new AddLeadPage(driver);
        base = new Base(driver);
        dashboardPage = new DashboardPage(driver);
        leadsSettings = new LeadsConfigs(driver);
        loginPage = new LoginPage(driver);
        configPage = new ConfigPage(driver);
        utils = new Property();
        viewLeadPage = new ViewLeadPage(driver);
    }
}
