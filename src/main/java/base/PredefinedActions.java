package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class PredefinedActions {

    protected static WebDriver driver;
    private static WebDriverWait wait;

    public static void startBroser(String browserName) {
        switch (browserName.toLowerCase()) {
            case "chrome":
//                WebDriverManager.chromedriver().setup();
                System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
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
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void clickOnElementUsingJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", element);
    }

    public void setText(WebElement element, String textToBeSet) {
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(textToBeSet);
    }

    public String getAlertMessage() {
        return driver.switchTo().alert().getText();
    }

    public static byte[] getScreenshotInByte() {
        TakesScreenshot ts = (TakesScreenshot) driver;
        return ts.getScreenshotAs(OutputType.BYTES);
    }

    public static File getScreenshotInFile() {
        TakesScreenshot ts = (TakesScreenshot) driver;
        return ts.getScreenshotAs(OutputType.FILE);
    }
}
