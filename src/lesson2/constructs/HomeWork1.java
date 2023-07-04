package lesson2.constructs;

/**
 * Написать программу для вывода названия поры года по номеру месяца.
 * При решении используйте оператор switch-case.
 */

public class HomeWork1 {

    public static void main(String[] args) {

        int month = 5;
        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет ");
        }
    }
}
