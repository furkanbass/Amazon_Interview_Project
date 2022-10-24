package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/html-reports/cucumber-reports.html"},
        features = "src/test/resources/features",
        glue = {"stepDefinitions"},
        tags = "@grid_feature",
        dryRun = false
)
public class GridRunner{
}