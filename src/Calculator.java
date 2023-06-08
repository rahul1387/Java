import java.util.Scanner;

public class Calculator {

    public static String Calc(int num1,int num2, char operator)
    {
        double result = 0;
        String resultData = "";
       if (operator=='+'){
           result = num1 + num2;
           resultData = "The addition of " + num1 + " and " + num2 + " is " + result;
       } else if (operator=='-') {
           result = num1 - num2;
           resultData = "The subtraction of " + num1 + " and " + num2 + " is " + result;
       }else if (operator=='*') {
           result = num1 * num2;
           resultData = "The multiplication of " + num1 + " and " + num2 + " is " + result;
       }else if (operator=='/') {
           result = num1 / num2;
           resultData = "The division of " + num1 + " and " + num2 + " is " + result;
       }else if (operator=='%') {
           result = num1 % num2;
           resultData = "The remainder of " + num1 + " divided by " + num2 + " is " + result;
       }
       return resultData;
    }

    public static void main(String[] args)
    {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to calculator \n You will be asked 3 inputs \n Input 1 will be number 1 \n Input 2 will be number 2 \n Input 3 will be operators(+,-,*,/,%)");
            System.out.print("Enter number 1: ");
            int firstNum = sc.nextInt();
            System.out.print("Enter number 2: ");
            int secondNum = sc.nextInt();
            System.out.print("Enter operator: ");
            char selectOperator = sc.next().charAt(0);

            String methodResult = Calc(firstNum, secondNum, selectOperator);
            System.out.println(methodResult);
        }catch (Exception ex){
            System.out.println("Please check your input and try again");
        }
    }
}
