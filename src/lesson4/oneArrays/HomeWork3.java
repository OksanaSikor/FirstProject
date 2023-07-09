package lesson4.oneArrays;

/**
 * Создайте 2 массива из 5 чисел.
 * Выведите массивы на консоль в двух отдельных строках.
 * Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение
 * оказалось больше (либо сообщите, что их средние арифметические равны).
 */

public class HomeWork3 {

    public static void main(String[] args) {

        int[] array1 = new int[5];
        for(int i = 0;i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 20);
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        int[] array2 = new int[5];
        for(int i = 0;i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 20);
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        double sumArray1=(double)array1[0]/array1.length;
        double sumArray2=(double)array2[0]/array1.length;

        if(sumArray1==sumArray2)System.out.println("Средние арифметические значения двух массивов равны");
        else {if(sumArray1>sumArray2)
            System.out.println("Среднее арифметическое значение первого массива больше и равно " + sumArray1);
        else System.out.println("Среднее арифметическое значение второго массива больше и равно " + sumArray2);
        }
    }
}
