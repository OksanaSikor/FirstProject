package lesson4.oneArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
 * Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
 * В результате должен быть новый массив без указанного числа.
 */

public class HomeWork1 {
    public static void main(String[] args) {
        int[] arr = {25, 1, 10, -15, 8, 52};
        int[] newArr = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число: ");
        int num = scanner.nextInt();

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == num){
                newArr = new int[arr.length - 1];
                for(int j = 0; j < i; j++){
                    newArr[j] = arr[j];
                }
                for(int j = i; j < arr.length - 1; j++){
                    newArr[j] = arr[j+1];
                }
                break;
            }
        }
        System.out.println(Arrays.toString(newArr));

    }
}

