package lesson2;

public class Practice {
    public static void main(String[] args) {

// Задача: Сделать цикл (for) от 1го до 10ти, каждая итерация которого будет выведена словами на экран. Например:
//“один” “два” … “десять”

        for (int i=1; i <= 10; i++) {
            if (i == 1 ){
                System.out.println("один");
            }
            else if (i == 2 ) {
                System.out.println("два");
            }
            else if (i == 3 ) {
                System.out.println("три");
            }
            else if (i == 4 ) {
                System.out.println("четыре");
            }
            else if (i == 5 ) {
                System.out.println("пять");
            }
            else if (i == 6 ) {
                System.out.println("шесть");
            }
            else if (i == 7 ) {
                System.out.println("семь");
            }
            else if (i == 8 ) {
                System.out.println("восемь");
            }
            else if (i == 9 ) {
                System.out.println("девять");
            }
            else if (i == 10 ) {
                System.out.println("десять");
            }
        }


//  Задача: «С помощью цикла while посчитать сумму четных элементов от 10 до 55».

        int sum = 0;
        int n = 10;
        while (n <= 55)
        {
            n++;
            if (n % 2 == 0)
            {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
