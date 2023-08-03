package lesson6.practice;

public class DayWeek
{
    private Day day;

    public DayWeek()
    {
    }

    public Day getDay()
    {
        return day;
    }

    public void setDay(Day day)
    {
        this.day = day;
    }

    public void dayType(Day day)
    {
        if(day == Day.MONDAY)
        {
            System.out.println( day + " work day");
        }
        else if (day == Day.TUESDAY)
        {
            System.out.println( day + " work day");
        }
        else if (day == Day.WEDNESDAY)
        {
            System.out.println( day + " work day");
        }
        else if (day == Day.THURSDAY)
        {
            System.out.println( day + " work day");
        }
        else if (day == Day.FRIDAY)
        {
            System.out.println( day + " work day");
        }
        else if (day == Day.SATURDAY)
        {
            System.out.println( day + " weekend day");
        }
        else if (day == Day.SUNDAY)
        {
            System.out.println( day + " weekend day");
        }
    }
}
