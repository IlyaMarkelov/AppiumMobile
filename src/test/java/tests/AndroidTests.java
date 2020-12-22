package tests;

import lib.AndroidTestCore;
import lib.Models.User;
import lib.UI.Android.AndroidPersonalAccount;
import org.junit.Test;

public class AndroidTests extends AndroidTestCore {

    User user = new User();

    //Registration new admin
    @Test
    public void testRegistrationNewAdmin(){
        AndroidPersonalAccount personalAccount = new AndroidPersonalAccount(driver);
        personalAccount.findAndInputFirstRegistrationName(user.firstName);
        personalAccount.findAndInputLastRegistrationName(user.lastName);
        personalAccount.inputEmailAndPassword(user.registrationEmail, user.password);
        personalAccount.findAndClickSignUpButton();
        personalAccount.findToolBarCalendarFrame();
    }

    //Login, LogOut
    @Test
    public void testLogInAndLogOut(){

       AndroidPersonalAccount personalAccount = new AndroidPersonalAccount((driver));
       personalAccount.findAndClickChangeAction();
       personalAccount.inputEmailAndPassword(user.email, user.password);
       personalAccount.findAndClickLogIn();
       personalAccount.findToolBarCalendarFrame();
       personalAccount.findAndClickAvatar();
       personalAccount.findAndClickMoreOptions();
       personalAccount.findAndClickLogOut();
       personalAccount.findLoginRegisterFrame();
   }

   //Тест изменения пароля для лк
    @Test
    public void testChangePassword(){

        AndroidPersonalAccount personalAccount = new AndroidPersonalAccount((driver));
        personalAccount.findAndClickChangeAction();
        personalAccount.inputEmailAndPassword(user.email, user.password);
        personalAccount.findAndClickLogIn();
        personalAccount.findAndClickAvatar();
        personalAccount.findAndClickChangePasswordBeforeInput();
        personalAccount.inputOldAndNewPasswords(user.password,user.newPassword);
        personalAccount.findAndClickChangePasswordAfterInput();
        personalAccount.findAndClickMoreOptions();
        personalAccount.findAndClickLogOut();
        personalAccount.findAndClickChangeAction();
        personalAccount.inputEmailAndPassword(user.email,user.newPassword);
        personalAccount.findAndClickLogIn();
        personalAccount.findAndClickAvatar();
        personalAccount.findAndClickChangePasswordBeforeInput();
        personalAccount.inputOldAndNewPasswords(user.newPassword, user.password);
        personalAccount.findAndClickChangePasswordAfterInput();
        personalAccount.findAndClickMoreOptions();
        personalAccount.findAndClickLogOut();
    }

    //Тест изменения данных в лк
    @Test
    public void testChangeTheData() {

        AndroidPersonalAccount personalAccount = new AndroidPersonalAccount((driver));
        personalAccount.findAndClickChangeAction();
        personalAccount.inputEmailAndPassword(user.email, user.password);
        personalAccount.findAndClickLogIn();
        personalAccount.findToolBarCalendarFrame();
        personalAccount.findAndClickAvatar();
        personalAccount.findAndInputCompany(user.organization);
        personalAccount.findAndInputPosition(user.position);
        personalAccount.findAndClickBackToCalendar();
        personalAccount.findAndClickAvatar();
        personalAccount.findAndClickMoreOptions();
        personalAccount.findAndClickLogOut();
        personalAccount.findAndClickChangeAction();
        personalAccount.inputEmailAndPassword(user.email, user.password);
        personalAccount.findAndClickLogIn();
        personalAccount.findAndClickAvatar();

        //TODO: доделать проверку
//        String article_company_name = personalAccount.getArticleCompanyInput(organization);
//        String article_position_name = personalAccount.getArticlePositionInput(position);
//        Assert.assertEquals("We see unexpected company",organization,article_company_name);
//        Assert.assertEquals("We see unexpected position",position,article_position_name);
        personalAccount.findAndClearCompanyInput();
        personalAccount.findAndClearPositionInput();
        personalAccount.findAndClickBackToCalendar();
        personalAccount.findToolBarCalendarFrame();
    }
}

