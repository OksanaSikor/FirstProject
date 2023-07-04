package lesson2.constructs;

/**
 * По введенному номеру определить цвет радуги (1 - красный, 4 зеленый и т.д.)
 */

public class HomeWork5 {
    public static void main(String[] args) {

        int color = 5;
        switch (color){
            case 1:
                System.out.println("красный");
                break;
            case 2:
                System.out.println("оранжевый");
                break;
            case 3:
                System.out.println("жёлтый");
                break;
            case 4:
                System.out.println("зелёный");
                break;
            case 5:
                System.out.println("голубой");
                break;
            case 6:
                System.out.println("синий");
                break;
            case 7:
                System.out.println("фиолетовый");
                break;
            default:
                System.out.println("Такого цвета в радуге нет ");
        }
    }
}
