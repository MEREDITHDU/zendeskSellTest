package base;

import net.itarray.automotion.tools.web.BaseWebMobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static environment.EnvironmentSetup.shortWait;

/**
 * @author Qilin
 * @version 1.0
 */
public class Base extends BaseWebMobileElement {

    /**
     *
     * @param driver
     */
    public Base(WebDriver driver) {
        super(driver);
    }

    /**
     * @param by
     * @return
     */
    protected boolean IsElementVisibleWithShortWait(By by) {
        try {
            return shortWait.until(ExpectedConditions.visibilityOfElementLocated(by)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     *
     * @param s
     * @param text
     * @return
     */
    protected By formatXpathFromString(String s, String text) {
        return By.xpath(String.format(s, text));
    }
}
