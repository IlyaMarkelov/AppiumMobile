package appiumtests.lib.Models;

import lombok.Getter;
import lombok.Setter;

public class User {

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String password;

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return user.getFirstName().equals(firstName) && user.getLastName().equals(lastName)
                && user.getEmail().equals(email) && user.getPassword().equals(password);
    }

}
