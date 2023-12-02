package steps;

import base.PredefinedActions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.File;
import java.io.IOException;

import static base.PredefinedActions.*;

public class AutomationHooks {

    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println(scenario.getSourceTagNames());
        PredefinedActions.startBroser("chrome");
    }

    @After
    public void afterScenario(Scenario scenario) throws IOException {
        if (scenario.isFailed())
            scenario.embed(getScreenshotInByte(), "image/png");
        PredefinedActions.closeBrowser();
    }

}
