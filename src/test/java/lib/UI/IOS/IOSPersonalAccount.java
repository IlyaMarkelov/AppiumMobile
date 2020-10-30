package lib.UI.IOS;

import lib.UI.MainPageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class IOSPersonalAccount extends MainPageObject {

    private static final String FIRST_NAME_REGISTRATION_INPUT = "xpath://XCUIElementTypeTextField[@value='Name']";
    private static final String LAST_NAME_REGISTRATION_INPUT = "xpath://XCUIElementTypeTextField[@value='Surname']";
    private static final String CHANGE_ACTION_BUTTON = "id:changeToLoginLabel";
    private static final String EMAIL_INPUT = "id:emailTextField";
    private static final String PASSWORD_INPUT = "id:passwordTextField";
    private static final String LOG_IN_BUTTON = "xpath:///XCUIElementTypeButton[@name='loginButton']";
    private static final String REGISTER_BUTTON = "xpath://XCUIElementTypeButton[@name='Register']";
    private static final String AVATAR_BUTTON = "xpath://XCUIElementTypeNavigationBar[@name='Calendar']/XCUIElementTypeButton[1]";
    private static final String ACCOUNT_SETTINGS_BUTTON = "xpath://XCUIElementTypeApplication[@name='Webinar']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther";
    private static final String LOG_OUT_BUTTON = "xpath://XCUIElementTypeApplication[@name='Webinar']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther";
    private static final String CHANGE_PASSWORD_BUTTON_BEFORE_INPUT = "id:ru.webinar.mobile:id/llChangePass";
    private static final String OLD_PASSWORD_INPUT = "ru.webinar.mobile:id/etOldPassword";
    private static final String NEW_PASSWORD_INPUT = "ru.webinar.mobile:id/etNewPassword";
    private static final String CHANGE_PASSWORD_BUTTON_AFTER_INPUT = "ru.webinar.mobile:id/btnChangePassword";
    private static final String REGISTER_FRAME = "id:To access the webinar calendar, enter your data, which you usually use to register for webinars";
    private static final String TOOLBAR_CALENDAR_FRAME = "xpath://XCUIElementTypeNavigationBar[@name='Calendar']";
    private static final String COMPANY_INPUT = "ru.webinar.mobile:id/etSettsOrganization";
    private static final String POSITION_INPUT = "ru.webinar.mobile:id/etSettsPosition";
    private static final String BACK_TO_CALENDAR_BUTTON = "xpath://XCUIElementTypeNavigationBar[@name='Settings']/XCUIElementTypeButton";




    public IOSPersonalAccount(AppiumDriver driver){
        super(driver);
    }

    public void findAndClickChangeAction(){
        this.waitForElementAndClick(CHANGE_ACTION_BUTTON,"Cannot find and click change action button",5);
    }

    public void inputEmailAndPasswordRegistration(String email_line, String password_line){
        this.waitForElementAndSendKeys(EMAIL_INPUT,email_line,"Cannot find and type into email input",5);
        this.waitForElementAndClick(REGISTER_FRAME,"Cannot find and click login register frame",5);
        this.waitForElementAndSendKeys(PASSWORD_INPUT,password_line, "Cannot find and type into password input",5);
        this.waitForElementAndClick(REGISTER_FRAME,"Cannot find and click login register frame",5);
    }

    public void inputEmailAndPasswordLogIn(String email_line, String password_line){
        this.waitForElementAndSendKeys(EMAIL_INPUT,email_line,"Cannot find and type into email input",5);
        this.waitForElementAndSendKeys(PASSWORD_INPUT,password_line, "Cannot find and type into password input",5);
    }

    public void findAndClickLogIn(){
        this.waitForElementAndClick(LOG_IN_BUTTON,"Cannot find and click log in button",5);
    }

    public void findAndClickAvatar(){
        this.waitForElementAndClick(AVATAR_BUTTON,"Cannot find and click change action button",5);
    }

    public void findAndClickAccountSettingsButton(){
        this.waitForElementAndClick(ACCOUNT_SETTINGS_BUTTON,"Cannot find and click change action button",5);
    }

    public void findAndClickLogOut(){
        this.waitForElementAndClick(LOG_OUT_BUTTON,"Cannot find and click change action button",5);
    }

    public void findAndClickChangePasswordBeforeInput(){
        this.waitForElementAndClick(CHANGE_PASSWORD_BUTTON_BEFORE_INPUT,"Cannot find and click change password button",5);
    }

    public void inputOldAndNewPasswords(String old_password_line, String new_password_line){
        this.waitForElementAndSendKeys(OLD_PASSWORD_INPUT,old_password_line,"Cannot find and type into old password input",5);
        driver.hideKeyboard();
        this.waitForElementAndSendKeys(NEW_PASSWORD_INPUT,new_password_line, "Cannot find and type into new password input",5);
        driver.hideKeyboard();
    }

    public void findAndClickChangePasswordAfterInput(){
        this.waitForElementAndClick(CHANGE_PASSWORD_BUTTON_AFTER_INPUT,"Cannot find and click change password button",5);
    }

    public void findLoginRegisterFrame(){
        this.waitForElementIsPresent(REGISTER_FRAME,"Cannot find login register frame",5);
    }

    public void findToolBarCalendarFrame(){
        this.waitForElementIsPresent(TOOLBAR_CALENDAR_FRAME,"Cannot find toolbar calendar frame",5);
    }

    public void findAndInputCompany(String company_line){
        this.waitForElementAndSendKeys(COMPANY_INPUT,company_line,"Cannot find and type into email input",5);
    }

    public void findAndInputPosition(String position_line){
        this.waitForElementAndSendKeys(POSITION_INPUT,position_line,"Cannot find and type into email input",5);
    }

    public void findAndClickBackToCalendar(){
        this.waitForElementAndClick(BACK_TO_CALENDAR_BUTTON,"Cannot find and click change password button",5);
    }

    public String getArticleCompanyInput(String company_name){
        WebElement company_Element = waitForElementPresent(COMPANY_INPUT,"Cannot find and type into company input",5);
        return company_Element.getAttribute(company_name);
    }

    public String getArticlePositionInput(String position_name){
        WebElement company_Element = waitForElementPresent(POSITION_INPUT,"Cannot find and type into position input",5);
        return company_Element.getAttribute(position_name);
    }

    public void findAndClearCompanyInput(){
        this.waitElementAndClear(COMPANY_INPUT,"Cannot find and clear into company input",5);
    }

    public void findAndClearPositionInput(){
        this.waitElementAndClear(POSITION_INPUT,"Cannot find and clear into position input",5);
    }

    public void findAndInputFirstRegistrationName(String first_name_line){
        this.waitForElementAndSendKeys(FIRST_NAME_REGISTRATION_INPUT,first_name_line,"Cannot find and type into first name input",5);
    }

    public void findAndInputLastRegistrationName(String last_name_line){
        this.waitForElementAndSendKeys(LAST_NAME_REGISTRATION_INPUT,last_name_line,"Cannot find and type into first name input",5);
    }

    public void findAndClickSignUpButton(){
        this.waitForElementAndClick(REGISTER_BUTTON,"Cannot find and click sign up button",5);
    }


}
