import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags={"@TEST_POEC3-21"},
        glue = "stepsdefs",
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json","junit:target/surefire-reports/cucumber.xml"},
        monochrome = true


)
public class RunnerTests {
}
