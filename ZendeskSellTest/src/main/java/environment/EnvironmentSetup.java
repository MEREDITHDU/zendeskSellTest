package environment;

import base.Property;
import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.util.Assert;

/**
 *
 * @author Qilin
 * @version 1.0
 */
public class EnvironmentSetup {

    public static WebDriverWait shortWait;
    protected static WebDriver driver;

    /**
     *
     * @throws Exception
     */
    protected static void initDriver() throws Exception {
        if (driver == null) {
            Property utils = new Property();
            String browserType = utils.getPropertyData("Browser.Type");
            switch (browserType) {
                case "Firefox":
                    FirefoxDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
                    driver = new FirefoxDriver();
                    break;
                case "IE":
                    InternetExplorerDriverManager.getInstance(DriverManagerType.IEXPLORER).setup();
                    driver = new InternetExplorerDriver();
                    break;
                case "Chrome":
                    ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
                    driver = new ChromeDriver();
                    break;
                default:
                    throw new Exception("Unknown browser");
            }

            driver.manage().window().maximize();
            driver.get(utils.getPropertyData("Browser.Url"));
            shortWait = new WebDriverWait(driver, 3);
        }

        Assert.notNull(driver, "Driver is null.Go to properties page to set default web browser!");
    }
}
