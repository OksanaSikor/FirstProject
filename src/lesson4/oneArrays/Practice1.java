package lesson4.oneArrays;

//задан массив
//int[] mas = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13}
//Найти максимальное и минимальное значения и вывести на экран.


import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args)
    {

        int[] arr = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
        int min = arr[0];
        int max = arr[0];
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++)  //Найти минимальное значение
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println(min);

        for(int i = 0; i < arr.length; i++)  //Найти максимальное значение
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
