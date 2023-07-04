package lesson2.cycles;

/**
 * Вывести 10 первых чисел последовательности 0, -5, -10, -15..
 */

public class HomeWork5 {

    public static void main(String[] args){

        int counter = 1;
        int value = 0;
        while (counter < 11) {
            System.out.println(value);
            value -=5;
            counter++;
        }
    }


}
