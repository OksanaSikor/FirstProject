package lesson2.additionalTask;

/**
 * Напишите программу, которая выводит на консоль таблицу умножения.
 */

public class AdditionalTask3 {
    public static void main(String[] args) {

        for (int a = 1; a < 10; a ++) {

            for (int b = 1; b < 10; b ++)
                System.out.print (" " + a*b);
            System.out.println ();
        }
    }
}
