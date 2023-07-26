package lesson4.oneArrays;

//организовать ввод массива из потока ввода (клавиатуры) с
//использованием класса Scanner. Размер массива и его элементы
//ввести с клавиатуры с использованием класса Scanner.


import java.util.Arrays;
import java.util.Scanner;

public class Practice2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++)
        {
            array[i] = scanner.nextInt();
        }
        System.out.println("Массив: " + Arrays.toString(array));
    }
}
