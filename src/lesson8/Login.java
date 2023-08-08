package lesson8;

import javax.swing.*;

public class Login {

    String login;
    String password;
    String confirmPassword;

    public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) {

        try
        {
            if (!login.matches("^[a-zA-Z0-9_]{1,20}$")) {
                throw new WrongLoginException();
            }
            if (!password.matches("^[a-zA-Z0-9_]{1,20}$")) {
                throw new WrongPasswordException();
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException();
            }
            return true;
        }
        catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }


    }
}
