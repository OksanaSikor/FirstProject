package lesson4.oneArrays;

import java.util.Arrays;


/**
 * Реализуйте алгоритм сортировки (любой, кроме пузырька) - Сортировка вставками (Insertion Sort).
 */

public class HomeWork7 {

    public static void main(String[] args) {

        int[] array = {10, -2, 18, 3, 1, 2, 5};

        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {

            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));

    }
}
