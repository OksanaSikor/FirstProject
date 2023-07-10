package lesson4.multiArrays;

/**
 * Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.
 */

public class HomeWork5 {

    public static void main(String[] args) {
        int a[][] = new int[10][10];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int) (Math.random() * 50);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a.length; k++) {
                    for (int n = 0; n < a[k].length; n++) {
                        if (a[k][n] > a[i][j]) {
                            temp = a[k][n];
                            a[k][n] = a[i][j];
                            a[i][j] = temp;
                        }
                    }
                }
            }
        }

        System.out.println("Упорядоченный массив: ");
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

