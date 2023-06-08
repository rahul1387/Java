import java.util.Scanner;

public class otpGenerator {

    public static void main(String[] args)
    {
        double otp = Math.random();
        int zeroGenerator = ZeroGenerator();
        System.out.println("Your Otp is: " + (int) (otp * zeroGenerator));
    }
    public static int ZeroGenerator()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a range of otp: ");
        int rangeOtp = scanner.nextInt();
        String one = "1";

        for (int i = 0; i<rangeOtp; i++)
        {
            one = one + "0" ;

        }
        // return will return the variable into calling method means in main method.
        return (Integer.parseInt(one));
    }
}
