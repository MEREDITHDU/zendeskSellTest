package pageobject;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Qilin
 * @version 1.0
 */
public class ConfigPage extends Base {

    /**
     * @param driver
     */
    public ConfigPage(WebDriver driver) {
        super(driver);
    }

    public enum SettingsSubPages {
        CONTACTS, LEADS, VISITS; 

        public String toString() {
            switch (this) {
                case CONTACTS: return ".js-sales-accounts";
                case VISITS: return ".visits";
                case LEADS: return ".leads";
            }
            return null;
        }
    }

    /**
     * @param subPageName
     */
    public void navigateToSettingsSubPage(Enum subPageName) {
        getWebElement(By.cssSelector(subPageName.toString())).click();
    }
}
