package pageobject;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author บฺรร
 * @version 1.0
 */
public class LoginPage extends Base {

    private final WebDriver driver;

    /**
     * @param driver
     */
    public LoginPage(WebDriver driver) {
    super(driver);
    this.driver = driver;
  }

    private final  By loginInputLocator = By.id("user_email");
    private final  By passInputLocator = By.id("user_password");
    private final  By loginButtonLocator = By.className("login-button");
    private final  By userIconLocator = By.id("user-dd");

    /**
     * @param login
     * @param pass
     * @return
     */
    public LoginPage loginToSell(String login, String pass) {
    getWebElement(loginInputLocator).sendKeys(login);
    getWebElement(passInputLocator).sendKeys(pass);
    getWebElement(loginButtonLocator).click();

    return new LoginPage(driver);
  }

    /**
     * @return
     */
    public boolean isUserLoggedIn() {
    return IsElementVisibleWithShortWait(userIconLocator);
  }
}
