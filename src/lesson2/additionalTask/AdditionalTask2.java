package lesson2.additionalTask;

/**
 * За каждый месяц банк начисляет к сумме вклада 7% от суммы.
 * Напишите программу, в которой пользователь вводит сумму вклада и количество месяцув. А банк вычисляет конечную сумму
 * вклада с учетом начисления процентов на каждый месяц.
 * Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.
 */

import java.util.Scanner;

public class AdditionalTask2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float sum = in.nextFloat();
        System.out.print("Введите срок вклада в месяцах: ");
        int period = in.nextInt();

        for(int i = 1; i <= period; i++){
            sum += sum * 0.07;
        }
        System.out.printf("После %d месяцев сумма вклада составит %f", period, sum);
    }
}
