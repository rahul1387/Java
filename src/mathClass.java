import java.util.Scanner;

public class mathClass
{
    public static void Max()
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        int mathMax1 = Math.max(num1,num2);
        int mathMax2 = Math.max(num3,num4);
        System.out.println(mathMax1);
        System.out.println(mathMax2);
    }
    public static void main(String[] args)
    {
        int num1 = 45;
        int num2 = 6;

        int math = Math.min(num1, num2);
        System.out.println(math);
    }
}
