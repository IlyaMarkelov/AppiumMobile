package tests;

import lib.IOSTestCore;
import lib.Models.User;
import lib.UI.IOS.IOSPersonalAccount;
import org.junit.Test;

public class IOSTests extends IOSTestCore {
    User user = new User();


    @Test
    public void testRegistrationNewAdmin() {

        IOSPersonalAccount personalAccount = new IOSPersonalAccount(driver);
        personalAccount.findAndInputFirstRegistrationName(user.firstName);
        personalAccount.findAndInputLastRegistrationName(user.lastName);
        personalAccount.inputEmailAndPasswordRegistration(user.registrationEmail, user.password);
        personalAccount.findAndClickSignUpButton();
        personalAccount.findToolBarCalendarFrame();
    }

    //Login, LogOut
    @Test
    public void testLogInAndLogOut(){

        IOSPersonalAccount personalAccount = new IOSPersonalAccount(driver);
        personalAccount.findAndClickChangeAction();
        personalAccount.inputEmailAndPasswordLogIn(user.email, user.password);
        personalAccount.findAndClickLogIn();
        personalAccount.findToolBarCalendarFrame();
        personalAccount.findAndClickAvatar();
        //personalAccount.findAndClickAccountSettingsButton();
        personalAccount.findAndClickLogOut();
        personalAccount.findLoginRegisterFrame();
    }
}

