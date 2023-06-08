import java.util.Scanner;

public class whileLoopPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Question1
//        int number = 100;
//        while (number>1)
//        {
//            System.out.println(number);
//            number = number-2;
//        }
        //Question2

//        System.out.print("Enter a number: ");
//        int tableNum = sc.nextInt();
//        int till = 1;
//
//        while (till<=20)
//        {
//            int result;
//            result = tableNum*till;
//            System.out.println(tableNum + " * " + till + " = " + result);
//            till++;
//        }

        //Question3
//        System.out.print("Enter digits: ");
//        long digit = sc.nextLong();
//
//        for (int i = 1; i<=digit; i++)
//        {
//            System.out.print(i);
//            System.out.println(digit);
//        }

        //Question4
        System.out.println("Welcome to two digit calculator!!");
        System.out.print("Enter first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = sc.nextInt();

        System.out.print("Which operator would you like to choose(/,*,-,+,%): ");
        char operator = sc.next().charAt(0);
         int result = 0;

        if (operator=='*')
        {
           result = firstNum * secondNum;
           System.out.println(firstNum + " " + operator + " " + secondNum + " = " + result);
        } else if (operator=='/')
        {
            result = firstNum / secondNum;
            System.out.println(firstNum + " " + operator + " " + secondNum + " = " + result);
        } else if (operator=='+')
        {
            result = firstNum + secondNum;
            System.out.println(firstNum + " " + operator + " " + secondNum + " = " + result);
        } else if (operator=='-')
        {
            result = firstNum - secondNum;
            System.out.println(firstNum + " " + operator + " " + secondNum + " = " + result);
        } else if (operator=='%')
        {
            result = firstNum % secondNum;
            System.out.println(firstNum + " " + operator + " " + secondNum + " = " + result);
        }else
        {
            System.out.println("Invalid operator!!");
        }
    }
}
