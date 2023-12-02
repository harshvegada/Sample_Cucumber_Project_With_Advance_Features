package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/java/featureFiles/",
        glue = "steps",
        monochrome = true,
        strict = true,
        dryRun = false,
        tags = "@1",
        snippets = SnippetType.UNDERSCORE,
        plugin = {
                "pretty",
                "html:target/cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
)
public class RunnerTest {


}
