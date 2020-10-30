package lib.UI.Android;

import lib.UI.MainPageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;


public class AndroidPersonalAccount extends MainPageObject {

     static  String FIRST_NAME_REGISTRATION_INPUT = "id:ru.webinar.mobile:id/etName";
     static  String LAST_NAME_REGISTRATION_INPUT = "id:ru.webinar.mobile:id/etSecondName";
     static  String CHANGE_ACTION_BUTTON = "id:ru.webinar.mobile:id/tvChangeAction";
     static  String EMAIL_INPUT = "id:ru.webinar.mobile:id/etEmail";
     static  String PASSWORD_INPUT = "id:ru.webinar.mobile:id/etPassword";
     static  String LOG_IN_BUTTON = "id:ru.webinar.mobile:id/btnAction";
     static  String AVATAR_BUTTON = "id:ru.webinar.mobile:id/tvAvatar";
     static  String MORE_OPTIONS_BUTTON = "xpath://android.widget.ImageView[@content-desc='More options']";
     static  String LOG_OUT_BUTTON = "xpath://*[@text='Log out']";
     static  String CHANGE_PASSWORD_BUTTON_BEFORE_INPUT = "id:ru.webinar.mobile:id/llChangePass";
     static  String OLD_PASSWORD_INPUT = "id:ru.webinar.mobile:id/etOldPassword";
     static  String NEW_PASSWORD_INPUT = "id:ru.webinar.mobile:id/etNewPassword";
     static  String CHANGE_PASSWORD_BUTTON_AFTER_INPUT = "id:ru.webinar.mobile:id/btnChangePassword";
     static  String LOGIN_REGISTER_FRAME = "id:ru.webinar.mobile:id/llLoginRegister";
     static  String TOOLBAR_CALENDAR_FRAME = "id:ru.webinar.mobile:id/llToolbar";
     static  String COMPANY_INPUT = "id:ru.webinar.mobile:id/etSettsOrganization";
     static  String POSITION_INPUT = "id:ru.webinar.mobile:id/etSettsPosition";
     static  String BACK_TO_CALENDAR_BUTTON = "xpath:/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton";




    public AndroidPersonalAccount(AppiumDriver driver){
        super(driver);
    }

    public void findAndClickChangeAction(){
        this.waitForElementAndClick(CHANGE_ACTION_BUTTON,"Cannot find and click change action button",5);
    }

    public void inputEmailAndPassword(String email_line, String password_line){
        this.waitForElementAndSendKeys(EMAIL_INPUT,email_line,"Cannot find and type into email input",5);
        this.waitForElementAndSendKeys(PASSWORD_INPUT,password_line, "Cannot find and type into password input",5);
    }

    public void findAndClickLogIn(){
        this.waitForElementAndClick(LOG_IN_BUTTON,"Cannot find and click log in button",5);
    }

    public void findAndClickAvatar(){
        this.waitForElementAndClick(AVATAR_BUTTON,"Cannot find and click change action button",5);
    }

    public void findAndClickMoreOptions(){
        this.waitForElementAndClick(MORE_OPTIONS_BUTTON,"Cannot find and click change action button",5);
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
        this.waitForElementIsPresent(LOGIN_REGISTER_FRAME,"Cannot find login register frame",5);
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
        driver.hideKeyboard();
        this.waitForElementAndClick(LOG_IN_BUTTON,"Cannot find and click sign up button",5);
    }


}
