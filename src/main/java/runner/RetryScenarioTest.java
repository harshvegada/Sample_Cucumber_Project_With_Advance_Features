package runner;

import org.junit.runner.RunWith;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
        jsonReport = "target/cucumber.json",
        retryCount = 2, // Number of times retry should happen in case of failure
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        jsonUsageReport = "target/cucumber-usage.json",
        usageReport = true,
        toPDF = true,
        excludeCoverageTags = {""},//Tags which need to excluded from coverage Report
        includeCoverageTags = {"@smoke"},//Tags which need to included into coverage Report
        outputFolder = "target")

@CucumberOptions(
        plugin = "html:target/cucumber-html-report",
        features = "src/test/java/featureFiles",
        glue = "steps"
)


public class RetryScenarioTest {
}
