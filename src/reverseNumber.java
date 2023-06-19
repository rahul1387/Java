import java.util.Scanner;

public class reverseNumber {
    public static void reverseNum(int num)
    {
        int rev=0,rem;
        while (num!=0)
        {
            //This is formula to reverse a number
            rem = num % 10;
            rev=rev * 10 + rem;
            num = num / 10;
        }
        System.out.print("The Revers of this number is: " + rev);
    }
    public static void main(String[] args)
    {
        try
        {
            Scanner sc =  new Scanner(System.in);
            System.out.print("Enter a number digits: ");
            int number = sc.nextInt();
            reverseNum(number);
        }catch (Exception ex)
        {
            System.out.println("Pls enter integers!");
        }


    }
}
