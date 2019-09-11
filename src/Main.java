import java.util.*;

class Time
{
    static String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    static int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
    static int start = 5;


    static int _convert(int month, int day)
    {
        int days = day;
        for(int i = 0; i < month-1; i++)
            days += months[i];
        return days;
    }
    static String get_week(int month, int day)
    {
        int idx = start + _convert(month, day);
        return week[idx%7];
    }

}

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
        {
           System.out.println(Time.get_week(sc.nextInt(), sc.nextInt()));
        }
    }
}
