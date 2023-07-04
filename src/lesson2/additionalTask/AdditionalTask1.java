package lesson2.additionalTask;

/**
 * Выведите на экран первые 11 членов последовательности Фибоначчи.
 */

public class AdditionalTask1 {

    public static void main(String[] args){
        int num1 = 1;
        int num2 = 1;
        int num3;
        System.out.print(num1 +" "+ num2 +" ");
        for(int i = 3; i <= 11; i++){
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num3 + " ");
        }
        System.out.println();
    }
}
