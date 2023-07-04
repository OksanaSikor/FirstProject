package lesson2.cycles;

/**
 * При помощи цикла for вывести на экран нечетные числа от 1 до 99.
 * При решении используйте операцию инкремента (++).
 */

public class HomeWork1 {
    public static void main(String[] args) {

        for(int i = 1; i <= 99; i++) {
                System.out.println(i++);
        }
    }
}
