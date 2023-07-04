package lesson1;

import java.util.Scanner;

/**
 * Написать программу для вывода "Hello <user>"  на консоль. Пусть <user> выводиться с консоли , программа должна
 * потребовать ввод <user>. Для чтения с консоли используйте класс Scanner.
 */

public class Lesson1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter name: ");
        name = scanner.next();
        System.out.println("Hello " + name);
    }
}