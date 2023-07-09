package lesson4.oneArrays;


/**
 * Создайте массив строк. Заполните его произвольными именами людей.
 * Отсортируйте массив.
 * Результат выведите на консоль.
 */

public class HomeWork6 {

    public static void main(String[] args) {
        String[] array = { "Anna", "Yury", "Oksana", "Viktor"};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i].compareTo(array[j]) > 0) {
                    String tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
            System.out.println(array[i]);
        }
    }
}
