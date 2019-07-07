package pageobject.Leads;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author บฺรร
 * @version 1.0
 */
public class ViewLeadPage extends Base {

    /**
     * @param driver
     */
    public ViewLeadPage(WebDriver driver) {
        super(driver);
    }
    private final By leadTitleLocator = By.className("detail-title");
    private final By leadStatusLocator = By.cssSelector(".status .lead-status");

    /**
     * @return 
     */
    public String getAddedLeadTitle() {
        String leadTitleText = getWebElement(leadTitleLocator).getText();
        return leadTitleText.split(" Edit")[0];  
    }
    /**
     * @return
     */
    public String getLeadStatus() {
        return getWebElement(leadStatusLocator).getText();
    }
}
