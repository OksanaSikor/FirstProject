package lesson5;

/**
 * Создать класс CreditCard c полями номер счета, текущая сумма на счету.
 * Добавьте метод, который позволяет начислять сумму на кредитную карточку.
 * Добавьте метод, который позволяет снимать с карточки некоторую сумму.
 * Добавьте метод, который выводит текущую информацию о карточке.
 * Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
 * Тестовый сценарий для проверки:
 * Положите деньги на первые две карточки и снимите с третьей.
 * Выведите на экран текущее состояние всех трех карточек.
 */

public class HomeWork1 {

    public static void main(String[] args) {

        CreditCard creditCard1 = new CreditCard();
        creditCard1.number = "PL11AL3014500ZKD0110440000";
        creditCard1.sum = 2000;
        creditCard1.accrualOfTheAmount(5000);

        CreditCard creditCard2 = new CreditCard();
        creditCard2.number = "PL15AL3011200ZKD0110480000";
        creditCard2.sum = 1199;
        creditCard2.accrualOfTheAmount(8000);

        CreditCard creditCard3 = new CreditCard();
        creditCard3.number = "PL28AL3031200ZKD0110510000";
        creditCard3.sum = 1199;
        creditCard3.withdrawalOfTheAmount(1000);

        creditCard1.outputOfCurrentInformation();
        creditCard2.outputOfCurrentInformation();
        creditCard3.outputOfCurrentInformation();
    }
}
