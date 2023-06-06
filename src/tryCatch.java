import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //try will, try do the code and catch will store the error in variable Exception ignored
        int a = 0;
        int b = 1;
        int c;
        try
            {
                System.out.print("Enter a range: ");
                int range = sc.nextInt();
                System.out.println(a + " " + b);
                for (int i = 1; i<=range; i++)
                {
                    c=a+b;
                    System.out.println(" " + c);
                    a=b;
                    b=c; //This is known as swapping method
                }
            } catch (Exception ex)
            {
                System.out.print("Pls enter only number and try again!!");
            }

    }
}
