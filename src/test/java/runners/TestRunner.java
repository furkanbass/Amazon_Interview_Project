package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       plugin = {"html:target/html-reports/cucumber-reports.html"},
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@tc01",
        dryRun = false
)
public class TestRunner{
}
