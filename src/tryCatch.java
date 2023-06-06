import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //try will, try do the code and catch will store the error in variable Exception ignored
     try {
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();
         int sum = num1+num2;
         System.out.println("The sum these two numbers is: " + sum);
     }catch (Exception ignored){}
    }
}
