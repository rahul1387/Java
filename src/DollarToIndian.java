import java.math.BigDecimal;
import java.util.Scanner;

public class DollarToIndian {

    public static double Convertor(double dollar)
    {
        double rupees = dollar*82.49;
        return rupees;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dollar($): ");
        try
        {
            double inputDollar = sc.nextInt();
            double convertedResult = Convertor(inputDollar);
            System.out.println( "The " +inputDollar + " $ in indian rupees is: " + convertedResult + "rupees");
        }catch (Exception ex)
        {
            System.out.println("Please enter dollar only!");
        }

    }
}
