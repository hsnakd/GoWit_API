package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/java/features",
        glue = {"stepDefinitions", "hooks"},
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports/CucumberTestReport.json"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
