package lesson7;

import java.util.ArrayList;
import java.util.Arrays;

public class FigurePerimeters {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(8, 12);
        Rectangle rectangle2 = new Rectangle(10, 5);
        Triangle triangle1 = new Triangle(6, 5, 2);
        Circle circle1 = new Circle(48);
        Circle circle2 = new Circle(10);

        ArrayList<Figure> figureArrayList = new ArrayList<>(Arrays.asList(rectangle1, rectangle2,triangle1,circle1,circle2));
        for (Figure figure : figureArrayList){
            System.out.println(figure.getPerimeter());
        }
    }

    // А как посчитать сумму  периметра всех фигур в массивемму периметра всех фигур в массиве???
}