import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        boolean isPrime = true;

        int exit = 1;
        while (exit==1)
        {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            for (int i = 2; i < number; i++)
            {
                if (number % i == 0)
                {
                    System.out.println(number + " is not a prime number");
                    isPrime = false;
                    break;
                }
            }
            if (number < 0)
            {
                System.out.println("Negative number cannot be a prime number!!");
                isPrime = false;
            }
            if (isPrime)
            {
                System.out.println(number + " is a prime number");
            }
            System.out.println("Do want to continue press(1) if no press(0)");
            exit = sc.nextInt();
        }
    }
}
