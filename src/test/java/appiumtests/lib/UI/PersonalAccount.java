package appiumtests.lib.UI;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;


public class PersonalAccount extends MainPageObject {

    private static final String CHANGE_ACTION_BUTTON = "ru.webinar.mobile:id/tvChangeAction";
    private static final String EMAIL_INPUT = "ru.webinar.mobile:id/etEmail";
    private static final String PASSWORD_INPUT = "ru.webinar.mobile:id/etPassword";
    private static final String LOG_IN_BUTTON = "ru.webinar.mobile:id/btnAction";
    private static final String AVATAR_BUTTON = "ru.webinar.mobile:id/tvAvatar";
    private static final String MORE_OPTIONS_BUTTON = "//android.widget.ImageView[@content-desc='More options']";
    private static final String LOG_OUT_BUTTON = "//*[@text='Log out']";
    private static final String CHANGE_PASSWORD_BUTTON_BEFORE_INPUT = "ru.webinar.mobile:id/llChangePass";
    private static final String OLD_PASSWORD_INPUT = "ru.webinar.mobile:id/etOldPassword";
    private static final String NEW_PASSWORD_INPUT = "ru.webinar.mobile:id/etNewPassword";
    private static final String CHANGE_PASSWORD_BUTTON_AFTER_INPUT = "ru.webinar.mobile:id/btnChangePassword";
    private static final String LOGIN_REGISTER_FRAME = "ru.webinar.mobile:id/llLoginRegister";
    private static final String TOOLBAR_CALENDAR_FRAME = "ru.webinar.mobile:id/llToolbar";
    private static final String COMPANY_INPUT = "ru.webinar.mobile:id/etSettsOrganization";
    private static final String POSITION_INPUT = "ru.webinar.mobile:id/etSettsPosition";
    private static final String BACK_TO_CALENDAR_BUTTON = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton";




    public PersonalAccount(AppiumDriver driver){
        super(driver);
    }

    public void findAndClickChangeAction(){
        this.waitForElementAndClick(By.id(CHANGE_ACTION_BUTTON),"Cannot find and click change action button",5);
    }

    public void inputEmailAndPassword(String email_line, String password_line){
        this.waitForElementAndSendKeys(By.id(EMAIL_INPUT),email_line,"Cannot find and type into email input",5);
        this.waitForElementAndSendKeys(By.id(PASSWORD_INPUT),password_line, "Cannot find and type into password input",5);
    }

    public void findAndClickLogIn(){
        this.waitForElementAndClick(By.id(LOG_IN_BUTTON),"Cannot find and click log in button",5);
    }

    public void findAndClickAvatar(){
        this.waitForElementAndClick(By.id(AVATAR_BUTTON),"Cannot find and click change action button",5);
    }

    public void findAndClickMoreOptions(){
        this.waitForElementAndClick(By.xpath(MORE_OPTIONS_BUTTON),"Cannot find and click change action button",5);
    }

    public void findAndClickLogOut(){
        this.waitForElementAndClick(By.xpath(LOG_OUT_BUTTON),"Cannot find and click change action button",5);
    }

    public void findAndClickChangePasswordBeforeInput(){
        this.waitForElementAndClick(By.id(CHANGE_PASSWORD_BUTTON_BEFORE_INPUT),"Cannot find and click change password button",5);
    }

    public void inputOldAndNewPasswords(String old_password_line, String new_password_line){
        this.waitForElementAndSendKeys(By.id(OLD_PASSWORD_INPUT),old_password_line,"Cannot find and type into old password input",5);
        driver.hideKeyboard();
        this.waitForElementAndSendKeys(By.id(NEW_PASSWORD_INPUT),new_password_line, "Cannot find and type into new password input",5);
        driver.hideKeyboard();
    }

    public void findAndClickChangePasswordAfterInput(){
        this.waitForElementAndClick(By.id(CHANGE_PASSWORD_BUTTON_AFTER_INPUT),"Cannot find and click change password button",5);
    }

    public void findLoginRegisterFrame(){
        this.waitForElementIsPresent(By.id(LOGIN_REGISTER_FRAME),"Cannot find login register frame",5);
    }

    public void findToolBarCalendarFrame(){
        this.waitForElementIsPresent(By.id(TOOLBAR_CALENDAR_FRAME),"Cannot find toolbar calendar frame",5);
    }

    public void findAndInputCompany(String company_line){
        this.waitForElementAndSendKeys(By.id(COMPANY_INPUT),company_line,"Cannot find and type into email input",5);
    }

    public void findAndInputPosition(String position_line){
        this.waitForElementAndSendKeys(By.id(POSITION_INPUT),position_line,"Cannot find and type into email input",5);
    }

    public void findAndClickBackToCalendar(){
        this.waitForElementAndClick(By.xpath(BACK_TO_CALENDAR_BUTTON),"Cannot find and click change password button",5);
        //driver.runAppInBackground(Duration.ofSeconds(10));
    }

    public String getArticleCompanyInput(String company_name){
        WebElement company_Element = waitForElementPresent(By.id(COMPANY_INPUT),"Cannot find and type into company input",5);
        return company_Element.getAttribute(company_name);
    }

    public String getArticlePositionInput(String position_name){
        WebElement company_Element = waitForElementPresent(By.id(POSITION_INPUT),"Cannot find and type into position input",5);
        return company_Element.getAttribute(position_name);
    }

    public void findAndClearCompanyInput(){
        this.waitElementAndClear(By.id(COMPANY_INPUT),"Cannot find and clear into company input",5);
    }

    public void findAndClearPositionInput(){
        this.waitElementAndClear(By.id(POSITION_INPUT),"Cannot find and clear into position input",5);
    }
}
