import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class dateTime
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (dd/MM/yyyy):");
        String inputDate = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(inputDate, formatter);
        LocalDate currentDate = LocalDate.now();
        long yearDifference  = ChronoUnit.YEARS.between(date, currentDate);
        long monthDifference = ChronoUnit.MONTHS.between(date, currentDate);
        long daysDifference  = ChronoUnit.DAYS.between(date, currentDate);
        System.out.println(yearDifference + " Years");
        System.out.println(monthDifference + " Months");
        System.out.print(daysDifference + " Days");
    }
}
