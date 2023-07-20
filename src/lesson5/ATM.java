package lesson5;

public class ATM {

    int nominal20;
    int nominal50;
    int nominal100;

    public ATM(int nominal20, int nominal50, int nominal100) {
        this.nominal20 = nominal20;
        this.nominal50 = nominal50;
        this.nominal100 = nominal100;
    }

    public void accrualOfTheAmount(int addNominal20, int addNominal50, int addNominal100) //добавления денег в банкомат
    {
        nominal20 += addNominal20;
        nominal50 += addNominal50;
        nominal100 += addNominal100;
        int allAddNominal = addNominal20 * 20 + addNominal50 * 50 + addNominal100 * 100;
        int allNominal = nominal20 * 20 + nominal50 * 50 + nominal100 * 100;
    }

    public static boolean takeAwayMoney(int sum, int nominal20, int nominal50, int nominal100) //функция, снимающая деньги
    {
        if (sum > nominal20 * 20 + nominal50 * 50 + nominal100 * 100) {
            sum -= nominal20 * 20 + nominal50 * 50 + nominal100 * 100;
            return true;
        } else
            return false;
    }
}
