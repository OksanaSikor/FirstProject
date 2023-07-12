package lesson4.oneArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
 * Для генерации случайного числа используйте метод Math.random().
 * Пусть будет возможность создавать массив произвольного размера.
 * Пусть размер массива вводится с консоли.
 */

public class HomeWork2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое целое число: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()* 20);
        }
        System.out.println(Arrays.toString(array));

        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i])
                max = array[i];
            if(min > array[i])
                min = array[i];
            avg += array[i]/array.length;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }


}
