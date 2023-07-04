package lesson2.cycles;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит целое положительное число. А программа суммирует все числа от 1 до
 * введенного пользователем числа.
 * Для ввода числа воспользейтесь классом Scanner.
 */

public class HomeWork3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число: ");
        int n = scanner.nextInt();
        int sum = 0;
            for (int i = 1; i <= n; i++){
                sum = sum + i;
            }
            System.out.println (sum);
        }
}
