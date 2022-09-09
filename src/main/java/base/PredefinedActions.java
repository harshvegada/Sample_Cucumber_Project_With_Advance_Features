package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PredefinedActions {

    protected static WebDriver driver;
    static WebDriverWait wait;

    public static void startBroser(String browserName) {
        switch (browserName.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.get("http://automationbykrishna.com");
                break;
            case "firefox":
                break;
            default:
                throw new RuntimeException("Please select browser correctly... you chosen " + browserName);
        }
        wait = new WebDriverWait(driver, 30);
    }

    public static void closeBrowser() {
        driver.quit();
    }

    public void clickOnElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

    public void setText(WebElement element, String textToBeSet) {
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(textToBeSet);
    }

    public String getAlertMessage() {
        return driver.switchTo().alert().getText();
    }
}
