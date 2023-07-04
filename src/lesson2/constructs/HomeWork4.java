package lesson2.constructs;

/**
 * Для введенного числа t (температура на улице) вывести
 * Если t > -5, то вывести "Тепло".
 * Если -5 >= t > -20, то вывести "Нормально".
 * Если -20 >= t, то вывести "Холодно".
 */

public class HomeWork4 {

    public static void main(String[] args) {
        int t = -30;
        if (t > -5) {
            System.out.println("Тепло");
        }
        else if (t <= -5 && t > -20) {
            System.out.println("Нормально");
        }
        else if (-20 >= t) {
            System.out.println("Холодно");
        }
    }
}
