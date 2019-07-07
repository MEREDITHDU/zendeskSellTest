package pageobject.Leads;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Qilin
 * @version 1.0
 */
public class AddLeadPage extends Base {


    private final WebDriver driver;

    /**
     * @param driver
     */
    public AddLeadPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    private final By firstNameLocator= By.xpath("//input[@placeholder='First Name']");
    private final By lastNameLocator = By.xpath("//input[@placeholder='Last Name']");
    private final String addLeadFieldModifier = "//label[.='%s']/../../..//input";
    private final By saveAndViewButtonLocator = By.xpath("//button[@data-action='save-and-visit']");

    /**
     * @param firstName
     * @param lastName
     * @param companyName
     * @return addLeadPage
     */
    public AddLeadPage fillBasicLead(String firstName, String lastName, String companyName) {
        getWebElement(firstNameLocator).sendKeys(firstName);
        getWebElement(lastNameLocator).sendKeys(lastName);
        getWebElement(formatXpathFromString(addLeadFieldModifier, "Company Name")).sendKeys(companyName);
        return new AddLeadPage(driver);
    }

    /**
     * @return addLeadPage
     */
    public ViewLeadPage saveAndView() {
        getWebElement(saveAndViewButtonLocator).click();
        return new ViewLeadPage(driver);
    }
}
