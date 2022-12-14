package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/java/featureFiles/Registration.feature",
        glue = "steps",
        monochrome = true,
        strict = true,
        dryRun = false,
        tags = "@smoke",
        snippets = SnippetType.UNDERSCORE,
        plugin = {"pretty", "html:target/cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"}
)
public class Runner {


}
