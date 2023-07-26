package lesson4.oneArrays;

//организовать генерацию массива с использованием класса
//Random. Размер массива ввести с клавиатуры с использованием
//класса Scanner.


import java.util.Arrays;
import java.util.Scanner;

public class Practice3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое целое число: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random()* 30);
        }
        System.out.println(Arrays.toString(array));
    }
}
