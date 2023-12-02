package steps;

import base.PredefinedActions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

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
            scenario.attach(getScreenshotInByte(), "image/png","Failed_at_"+ System.currentTimeMillis());
        PredefinedActions.closeBrowser();
    }

}
