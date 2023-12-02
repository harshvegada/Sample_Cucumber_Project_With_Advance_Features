package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegistrationPage;

public class RegistrationSteps {

    RegistrationPage registrationPage = new RegistrationPage();

    @Given("user click on registration page")
//    @Given("^user click on registration page$")
    public void user_click_on_registration_page() throws Throwable {
        registrationPage.clickOnRegistrationTab();
    }

    @Given("user enter {string} in username on registration page")
//    @Given("^user enter \"([^\"]*)\" in username on registration page$")
    public void user_enter_in_username_on_registration_page(String userName) throws Throwable {
        registrationPage.enterUserName(userName);
        Assert.fail();
    }

    @Given("user enter {string} in password on registration page")
//    @Given("^user enter \"([^\"]*)\" in password on registration page$")
    public void user_enter_in_password_on_registration_page(String password) throws Throwable {
        registrationPage.enterPassword(password);
    }

    @Given("user click on {string} button on registration page")
//    @Given("^user click on \"([^\"]*)\" button on registration page$")
    public void user_click_on_button_on_registration_page(String buttonName) throws Throwable {
        registrationPage.clickOnSubmitButton();
    }

    @Then("user verify {string} message on alert")
//    @Then("^user verify \"([^\"]*)\" message on alert$")
    public void user_verify_message_on_alert(String message) throws Throwable {
        Assert.assertTrue("Message not matching", registrationPage.getAlertMessage().contains(message));
    }

}
