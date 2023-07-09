package lesson4.oneArrays;

/**
 * Создайте массив и заполните массив.
 * Выведите массив на экран в строку.
 * Замените каждый элемент с нечётным индексом на ноль.
 * Снова выведете массив на экран на отдельной строке.
 */

public class HomeWork5 {

    public static void main(String[] args) {
        int[] array = new int[8];
        for(int i=0; i<array.length; i++){
            array[i] = (int)(Math.random()*20);
        }
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for(int i=0; i<array.length; i++) {
            if(i%2==0) {
                array[i]=0;
            }
            System.out.print(array[i]+" ");
        }
    }
}
