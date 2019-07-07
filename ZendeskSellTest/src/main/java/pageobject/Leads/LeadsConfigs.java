package pageobject.Leads;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author Qilin
 * @version 1.0
 */
public class LeadsConfigs extends Base {

    /**
     * @param driver
     */
    public LeadsConfigs(WebDriver driver) {
        super(driver);
    }
    private final By leadStatusesMenuLocator
            = By.xpath("//a[@data-toggle='lead-status']");

    private final String editLeadStatusNameButtonModifier
            = "//div[@class='control-group item' and contains(.,'%s')]//button[@class[contains(.,'edit')]]";
    private final String statusLabel
            = "//div[@id='lead-status']//h4[.='%s']";
    private final By editLeadStatusNameButtonsLocator
            = By.xpath("//div[@id='lead-status']//button[@class[contains(.,'edit')]]");
    private final By editLeadInputLocator
            = By.xpath("//div[@id='lead-status']//input[@id='name']");
    private final By saveButtonsForEditName
            = By.cssSelector(".save.btn");

    public void switchTabToLeadStatuses() {
        getWebElement(leadStatusesMenuLocator).click();
    }
    
    /**
     * @param status
     */
    public void updateFirstLeadStatusName(String status) {
        switchTabToLeadStatuses();
        getWebElements(editLeadStatusNameButtonsLocator).get(0).click();
        editedStatusFillAndSave(status);

    }

    /**
     * @param oldStatus
     * @param newStatus
     */
    public void updateLeadStatusName(String oldStatus, String newStatus) {
        switchTabToLeadStatuses();
        getWebElement(formatXpathFromString(editLeadStatusNameButtonModifier, oldStatus)).click();
        editedStatusFillAndSave(newStatus);
    }
    
    /**
     * @param newStatus
     */
    private void editedStatusFillAndSave(String newStatus) {
        WebElement inputForStatusElement = getWebElement(editLeadInputLocator);
        inputForStatusElement.clear();
        inputForStatusElement.sendKeys(newStatus);

        for (WebElement e: getWebElements(saveButtonsForEditName)) {
            if (e.isDisplayed()) {
                e.click();
                wait.until(ExpectedConditions.invisibilityOf(e));
            }
        }
    }

    /**
     * @param status
     * @return
     */
    public boolean isStatusAvailable(String status) {
        switchTabToLeadStatuses();
        return IsElementVisibleWithShortWait(formatXpathFromString(statusLabel, status));
    }
}
