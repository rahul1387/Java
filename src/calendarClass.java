import java.util.Calendar;
import java.util.Date;



public class calendarClass
{
    public static void main(String[] args)
    {
        Calendar calendar = Calendar.getInstance();
//        System.out.println("Year: " + calender.get(Calendar.YEAR));
//        System.out.println(calender.get(Calendar.HOUR_OF_DAY) + ":" + calender.get(Calendar.MINUTE) + ":" + calender.get(Calendar.SECOND));

        //Set a specific date
//        calender.set(Calendar.YEAR, 2022);
//        calender.set(Calendar.MONTH, Calendar.JULY);
//        calender.set(Calendar.DAY_OF_MONTH, 15);
//        System.out.println(calender.getTime());

        //Add
//        calender.add(Calendar.MONTH,2);
//        System.out.println(calender.getTime());

        //setTime
//        calendar .setTime(new Date());
//        System.out.println(calendar.getTime());

        //getActualMaximum
//        int maximumDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//        System.out.println(maximumDayOfMonth);

        //getActualMinimum
//        int minimumDayOfMonth = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
//        System.out.println(minimumDayOfMonth);

        //getFirstDayOFWeek
//         int firstDayOfWeek = calendar.getFirstDayOfWeek();
//        System.out.println("The first day of week is " + firstDayOfWeek);

        //get(Calendar.ZONE_OFFSET)
        int zoneOffset = calendar.get(Calendar.ZONE_OFFSET);
        System.out.println(zoneOffset);
    }
}
