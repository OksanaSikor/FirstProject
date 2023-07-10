package lesson4.multiArrays;

/**
 * Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива.
 */

public class HomeWork3 {
    public static void main(String[] args) {
        int a[][] = new int[5][5];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int) (Math.random() * 40);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for(int i = 0;i < 5;i++) {
            for (int j = 0; j < 5; j++) {
                sum += a[i][j];
            }
        }
                System.out.println("Сумма всех элементов массива - " + sum);
    }
}


