package lesson4.oneArrays;

import java.util.Scanner;

/**
 * Создайте массив из n случайных целых чисел и выведите его на экран.
 * Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10.
 * Если n не удовлетворяет условию - выведите сообщение об этом.
 * Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
 * Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
 */

public class HomeWork4 {
    public static void main(String[] args) {
        int n = 0;
        int c = 0;
        do{
            Scanner scn = new Scanner(System.in);
            System.out.println("Введите число большее больше 5 и меньше или равно 10");
            if(scn.hasNextInt()){
                n = scn.nextInt();
            }
            else System.out.println("Ошибка. Вы ввели не число!");
        }
        while (n < 4);

        int[] Array1 = new int[n];
        for(int i = 0; i < Array1.length; i++){
            Array1[i] = (int)(Math.random()*20);
            System.out.print(Array1[i] + " ");

            if(Array1[i]%2 == 0&Array1[i]!=0)
                c++;
        }
        System.out.println("");

        if(c > 0){
            int[] Array2 = new int[c];
            for(int i=0, b=0; i<Array1.length; i++){
                if (Array1[i]%2 == 0&Array1[i] != 0){
                    Array2[b] = Array1[i];
                    System.out.print(Array2[b] + " ");
                }
            }
        }
    }
}
