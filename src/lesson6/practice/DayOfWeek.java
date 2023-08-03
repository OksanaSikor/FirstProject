package lesson6.practice;

//Создайте ENUM со всеми днями недели. Сделайте метод в классе,
//который выведет все дни недели в консоль с указанием рабочий это день или выходной

public class DayOfWeek {
    public static void main(String[] args)
    {
        DayWeek dayWeek = new DayWeek();
        dayWeek.dayType(Day.MONDAY);
        dayWeek.dayType(Day.TUESDAY);
        dayWeek.dayType(Day.WEDNESDAY);
        dayWeek.dayType(Day.THURSDAY);
        dayWeek.dayType(Day.FRIDAY);
        dayWeek.dayType(Day.SATURDAY);
        dayWeek.dayType(Day.SUNDAY);
    }
}