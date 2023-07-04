package lesson2.constructs;

/**
 * Напишите программу, которая будет принимать на вход число ии на выход будет выводить сообщение четное число или нет.
 * Для определения четности числа используйте операцию получения остатка от деления - операция выглядит так: '%2'.
 */

public class HomeWork3 {

    public static void main(String[] args) {

        int num = 7;
        if ( num % 2 == 0 )
            System.out.println("Число четное");
        else
            System.out.println("Число нечетное");
    }
}
