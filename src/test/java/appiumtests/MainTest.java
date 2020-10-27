package appiumtests;

import appiumtests.lib.CoreTestCase;
import appiumtests.lib.Models.User;
import appiumtests.lib.UI.MainPageObject;
import appiumtests.lib.UI.PersonalAccount;
import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class MainTest extends CoreTestCase {

    private User user;
    private String email = "i.markelov@webinar.ru";
    private String password = "qwerty";
    private String newPassword = "qwerty123456";
    private String organization = "Webinar";
    private String position = "QA Engeener";


    @BeforeTest
    public void readParams(String fileToAttach, Integer tariffPeriod, String monthCount) {
        user = MainPageObject.getNewRandomUserProfileWithEmailAndPassword();
    }

    //Login, LogOut
    @Test
   public void testLogInAndLogOut(){

       PersonalAccount personalAccount = new PersonalAccount((driver));
       personalAccount.findAndClickChangeAction();
       personalAccount.inputEmailAndPassword(email, password);
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

        PersonalAccount personalAccount = new PersonalAccount((driver));
        personalAccount.findAndClickChangeAction();
        personalAccount.inputEmailAndPassword(email, password);
        personalAccount.findAndClickLogIn();
        personalAccount.findAndClickAvatar();
        personalAccount.findAndClickChangePasswordBeforeInput();
        personalAccount.inputOldAndNewPasswords(password,newPassword);
        personalAccount.findAndClickChangePasswordAfterInput();
        personalAccount.findAndClickMoreOptions();
        personalAccount.findAndClickLogOut();
        personalAccount.findAndClickChangeAction();
        personalAccount.inputEmailAndPassword(email,newPassword);
        personalAccount.findAndClickLogIn();
        personalAccount.findAndClickAvatar();
        personalAccount.findAndClickChangePasswordBeforeInput();
        personalAccount.inputOldAndNewPasswords(newPassword, password);
        personalAccount.findAndClickChangePasswordAfterInput();
        personalAccount.findAndClickMoreOptions();
        personalAccount.findAndClickLogOut();
    }

    @Test
    public void testChangeTheData() {

        PersonalAccount personalAccount = new PersonalAccount((driver));
        personalAccount.findAndClickChangeAction();
        personalAccount.inputEmailAndPassword(email, password);
        personalAccount.findAndClickLogIn();
        personalAccount.findToolBarCalendarFrame();
        personalAccount.findAndClickAvatar();
        personalAccount.findAndInputCompany(organization);
        personalAccount.findAndInputPosition(position);
        personalAccount.findAndClickBackToCalendar();
        personalAccount.findAndClickAvatar();
        personalAccount.findAndClickMoreOptions();
        personalAccount.findAndClickLogOut();
        personalAccount.findAndClickChangeAction();
        personalAccount.inputEmailAndPassword(email, password);
        personalAccount.findAndClickLogIn();
        personalAccount.findAndClickAvatar();

        //Доработать проверку
//        String article_company_name = personalAccount.getArticleCompanyInput(organization);
//        String article_position_name = personalAccount.getArticlePositionInput(position);
//        Assert.assertEquals("We see unexpected company",organization,article_company_name);
//        Assert.assertEquals("We see unexpected position",position,article_position_name);
        personalAccount.findAndClearCompanyInput();
        personalAccount.findAndClearPositionInput();
        personalAccount.findAndClickBackToCalendar();
        driver.closeApp();

    }
}

