package stepDefinitions;

import base.BaseAssistance;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/**
 * @author Qilin
 * @version 1.0
 */
public class BaseSteps extends BaseAssistance {

    /**
     * @throws Exception
     */
    @Before
  public void setUp() throws Exception {
    initDriver();
    initPages();
  }

    /**
     * @param scenario
     */
    @After
  public void tearDown(Scenario scenario) {
    if (scenario.isFailed()) {
      final byte[] screenshot = ((TakesScreenshot) driver)
              .getScreenshotAs(OutputType.BYTES);
      scenario.embed(screenshot, "image/png");
    }
    driver.quit();
  }
}
