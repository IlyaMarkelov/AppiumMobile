package appiumtests.lib.UI;

import appiumtests.lib.Models.User;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.security.auth.login.Configuration;

import static java.lang.String.format;


public class MainPageObject {

    protected AppiumDriver driver;

    public MainPageObject(AppiumDriver driver){

        this.driver = driver;
    }

    public WebElement waitForElementPresent(By by, String error_message, long timeOutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.withMessage(error_message + "\n");
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement waitForElementPresent(By by, String error_message){

        return waitForElementPresent(by, error_message,5);
    }

    public WebElement waitForElementAndClick(By by, String error_message, long timeoutInSeconds){
        WebElement element = waitForElementPresent(by,error_message,timeoutInSeconds);
        element.click();
        return element;
    }

    public WebElement waitForElementAndSendKeys(By by, String value, String error_message, long timeoutInSeconds){
        WebElement element = waitForElementPresent(by,error_message,timeoutInSeconds);
        element.sendKeys(value);
        element.click();
        return element;
    }

    public boolean waitForElementIsPresent(By by, String error_message, long timeoutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message + "\n");
        return wait.until(ExpectedConditions.not(ExpectedConditions.invisibilityOfElementLocated(by)));
    }

    public WebElement waitElementAndClear(By by, String error_message, long timeoutInSeconds){
        WebElement element = waitForElementPresent(by, error_message, timeoutInSeconds);
        element.clear();
        return element;
    }

    public static String generateRandomString(int lenght){
        return RandomStringUtils.randomAlphabetic(lenght).toLowerCase();
    }

    public static User getNewRandomUserProfile() {
        Integer randomValueLength = 9;
        User user = new User();
        user.setFirstName(generateRandomString(randomValueLength));
        user.setLastName(generateRandomString(randomValueLength));
        return user;
    }

    private static String generateRandomEmailInternal(String emailTemplate) {
        Integer randomPartLength = 9;
        return format(emailTemplate, generateRandomString(randomPartLength));
    }

    public static String generateRandomYopmailEmail() {
        return generateRandomEmailInternal("yopmail.email.template");
    }

    public static User getNewRandomUserProfileWithEmail() {
        User user = getNewRandomUserProfile();
        user.setEmail(generateRandomYopmailEmail());
        return user;
    }

    public static User getNewRandomUserProfileWithEmailAndPassword() {
        Integer randomValueLength = 9;
        User user = getNewRandomUserProfileWithEmail();
        user.setPassword(generateRandomString(randomValueLength));
        return user;
    }

}
