package lib.Models;

import lib.UI.MainPageObject;

public class User {

    public User user;
    public String firstName = "Ilya";
    public String lastName = "Markelov";
    public String email = "i.markelov@webinar.ru";
    public String password = "qwerty";
    public String newPassword = "qwerty123456";
    public String organization = "Webinar";
    public String position = "QA Engeener";
    public String adminMailDomen = "@test.webinar.ru";
    public String registrationEmail = MainPageObject.getSaltString() + adminMailDomen;

}
