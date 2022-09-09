package steps;

import base.PredefinedActions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class AutomationHooks {

    @Before
    public void beforeScenario(Scenario scenario){
        System.out.println(scenario.getSourceTagNames());
        PredefinedActions.startBroser("chrome");
    }

    @After
    public void afterScenario(Scenario scenario){
        PredefinedActions.closeBrowser();
    }

}
