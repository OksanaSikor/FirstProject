package lesson4.oneArrays;

/**
 * Создайте массив целых чисел.
 * Напишете программу, которая выводит сообщение о том, входит ли заданное число в массив или нет.
 * Пусть число для поиска задается с консоли (класс Scanner).
 */

import java.util.Scanner;

public class HomeWork0 {
    public static void main(String[] args) {
        int[] arr = {25, 1, 10, -15, 8, 52};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число: ");
        int num = scanner.nextInt();

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == num){

                System.out.println("заданное число входит в массив");
            }
            System.out.println("заданное число не входит в массив");
        }
    }
}


