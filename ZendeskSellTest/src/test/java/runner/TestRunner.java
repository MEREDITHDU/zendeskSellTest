package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * @author Qilin
 * @version 1.0
 */
@RunWith(Cucumber.class)
@CucumberOptions(tags = {"@Main or @Test"},
        glue = "stepDefinitions",
        features = "src/test/resources/features",
        plugin = {"pretty", "html:target/cucumber"})

public class TestRunner {

    @BeforeClass
  public static void setup() {
  }
}
