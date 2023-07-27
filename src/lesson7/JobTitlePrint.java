package lesson7;

public class JobTitlePrint
{
    public static void main(String[] args)
    {
    Director director = new Director("Aniskovich Yury");
    Worker worker = new Worker("Kovalchuk Ivan");
    Accountant accountant = new Accountant("Vidicheva Svetlana");

    director.printPositions();
    worker.printPositions();
    accountant.printPositions();
    }
}
