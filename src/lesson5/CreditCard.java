package lesson5;

public class CreditCard {

    String number;
    int sum;

    public void accrualOfTheAmount(int amount) //начисление суммы на кредитную карточку
    {
        sum += amount;
    }

    public void withdrawalOfTheAmount(int amount) //снятие суммы с кредитной карточки
    {
        if (amount > sum) {
            System.out.println("Остаток на счету меньше снимаемой суммы");
        }
        else{
            sum -= amount;}
    }

    public void outputOfCurrentInformation() //вывод текущей информации о карточке
    {
        System.out.println("Остаток на счету " + number + " составляет " + sum);
    }
}
