import java.util.Scanner;

public class leapYear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int exit = 1;



        while(exit==1){
            System.out.print("Enter a year: ");
            int year = sc.nextInt();
            if (isLeapYear(year))
            {
                System.out.println(year + " is a leap year");
            }else
            {
                System.out.println(year + " is not a leap year");
            }
            System.out.print("Do want to continue press(1) if no press(0): ");
            exit = sc.nextInt();
        }
    }
    public static boolean isLeapYear(int year)
    {
        if (year % 4 != 0)
        {
            return false;
        } else if (year % 100 != 0)
        {
            return true;
        } else if (year % 400 != 0)
        {
            return false;
        } else
        {
            return true;
        }
    }
}
