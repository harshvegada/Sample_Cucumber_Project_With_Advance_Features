package runner;

import courgette.api.CourgetteOptions;
import courgette.api.CourgetteRunLevel;
import courgette.api.CourgetteTestOutput;
import courgette.api.CucumberOptions;
import courgette.api.junit.Courgette;
import org.junit.runner.RunWith;

@RunWith(Courgette.class)
@CourgetteOptions(
        runLevel = CourgetteRunLevel.SCENARIO,
        rerunFailedScenarios = true,
        rerunAttempts = 3,
        environmentInfo = "browser=chrome; git_branch=master",
        reportTargetDir = "build",
        testOutput = CourgetteTestOutput.CONSOLE,
        reportTitle = "Automation By Krishna",
        cucumberOptions = @CucumberOptions(
                features = "src/test/resources/featureFiles/",
                glue = "steps",
                tags = "@1",
                publish = true,
                plugin = {
                        "pretty",
                        "json:build/cucumber-report/cucumber.json",
                        "html:build/cucumber-report/cucumber.html",
                        "junit:build/cucumber-report/cucumber.xml"}
        ),
        plugin = {
                "pretty",
                "html:target/cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
)
public class RunnerTest {

}
