package runner;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

@RunWith(ExtendedCucumber.class)
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
@ExtendedCucumberOptions(
        retryCount = 1
)
public class RunnerTest {

}
