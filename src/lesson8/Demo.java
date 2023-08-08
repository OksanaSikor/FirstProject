package lesson8;

import static lesson8.Login.checkLoginAndPassword;

public class Demo {
    public static void main(String[] args) {
        boolean result = checkLoginAndPassword("login123", "password1", "password123");

        if (result) {
            System.out.println("Логин и пароль верны");
        } else {
            System.out.println("Логин и/или пароль неверны");
        }

    }
}
