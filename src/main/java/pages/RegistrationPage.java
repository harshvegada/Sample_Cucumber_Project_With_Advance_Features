package pages;

import base.PredefinedActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends PredefinedActions {

    @FindBy(id = "registration2")
    WebElement registrationTab;

    @FindBy(id = "unameSignin")
    WebElement loginUserName;

    @FindBy(id = "pwdSignin")
    WebElement loginPassword;

    @FindBy(id = "btnsubmitdetails")
    WebElement loginSubmitButton;

    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }


    public void enterUserName(String userName) {
        setText(loginUserName, userName);
    }

    public void enterPassword(String password) {
        setText(loginPassword, password);
    }

    public void clickOnSubmitButton() {
        clickOnElement(loginSubmitButton);
    }

    public void clickOnRegistrationTab() {
        clickOnElement(registrationTab);
    }

    public String getMessage() {
        return getAlertMessage();
    }


}
