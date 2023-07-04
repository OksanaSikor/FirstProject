package lesson2.constructs;

/**
 * Написать программу для вывода названия поры года по номеру месяца.
 * При решении используйте оператор if-else-if.
 */

public class HomeWork2 {

    public static void main(String[] args) {

        int month = 10;
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
        }
        else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Весна");
        }
        else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Лето");
        }
        else {
            System.out.println("Осень");
        }
    }
}
