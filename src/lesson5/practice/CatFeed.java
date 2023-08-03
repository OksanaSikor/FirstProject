package lesson5.practice;

//Создайте класс кота с полями: имя, возраст, насыщение кота (количество корма)
//Создайте метод “кормежка”. Входным параметром укажите количество корма.
// Возвращаемое значение: true - кот наелся, false - кот не наелся

public class CatFeed {
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        cat.amount = 10;
        boolean notHungry = cat.feed(12);
        if (notHungry)
        {
            System.out.println(" Кот наелся");
        }
        else
        {
            System.out.println("Кот не наелся");
        }
    }
}
