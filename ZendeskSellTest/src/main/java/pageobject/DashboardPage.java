package pageobject;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobject.Leads.AddLeadPage;

/**
 *
 * @author Qilin 
 * @version 1.0
 */
public class DashboardPage extends Base {
    private final WebDriver driver;

    /**
     *
     * @param driver
     */
    public DashboardPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    
    private final By addButtonLocator = By.id("global-add");
    private final String addMenuListModifier = "//*[@data-role='menu-item' and .='%s']";
    private final By userIconLocator = By.id("user-dd");
    private final By userMenuSettingsLocator = By.cssSelector("li.settings");

    /**
     * @return
     */
    public AddLeadPage openAddNewLead() {
        mainAddButtonOpen();
        getWebElement(formatXpathFromString(addMenuListModifier, "Lead")).click();
        return new AddLeadPage(driver);
    }

    /**
     *
     * @return
     */
    public ConfigPage openSettings() {
        getWebElement(userIconLocator).click();
        getWebElement(userMenuSettingsLocator).click();
        return new ConfigPage(driver);
    }
    
    public void mainAddButtonOpen() {
        getWebElement(addButtonLocator).click();
    }
}
