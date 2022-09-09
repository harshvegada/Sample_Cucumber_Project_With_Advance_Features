package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = { "steps" },
        plugin = { "pretty",
                "html:target/cucumber-reports",
                "rerun:target/rerun.txt"},
        monochrome =true,
        features = { "@target/rerun.txt" }

)

public class ReRunScenario {
}
