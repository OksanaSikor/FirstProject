package lesson4.multiArrays;

import java.util.Arrays;

/**
 * Умножение двух матриц
 * Создайте два массива целых чисел размером 3х3 (две матрицы).
 * Напишите программу для умножения двух матриц.
 * Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * Ожидаемый результат: 1 2 3 1 1 1 0 0 0
 */

public class HomeWork2 {
    public static void main(String[] args) {


        int[][] matrixA = {{1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}};

        int[][] matrixB = {{1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}};
        int matrixC[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int u = 0; u < 3; u++) {
                for (int j = 0; j < 4; j++) {

                    matrixC[i][u] += matrixA[i][j] * matrixB[j][u];
                }
            }
        }

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixB[i][j] + " ");

            }
            System.out.println();
        }
    }
}
