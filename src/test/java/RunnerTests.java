import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags={"@Cas_de_Test_G3"},
        glue = "stepsdefs",
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json","junit:target/surefire-reports/cucumber.xml"},
        monochrome = true


)
public class RunnerTests {
}
