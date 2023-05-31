import java.util.*;

public class conditionals {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        /* if-else statement is used to add condition in code to make a decision.
             Syntax of if-else is :- if(condition)
         {
         statement will execute if condition is true
         }else
         {
         statement will the condition is false
         }
         here's a example
         */
//        System.out.print("Enter your age: ");
//        int age = check.nextInt();
//
//        if (age>=18){
//            System.out.println("You are Adult");
//        }else {
//            System.out.println("You are not Adult");
//        }
        // here an another example
//        System.out.print("Enter a number: ");
//        long evenOdd = check.nextLong();

//        if (evenOdd % 2 == 0){
//            System.out.println("This is an even number");
//        }else {
//            System.out.println("This is an odd number");
//        }

        //There is one more which is if-else ladder

        /*
        here's a syntax
        if(condition){
        stt;
        }else if(condition){
        stt;
        }else {
        stt; if else if statement condition is false
        }here's an example
         */

//        System.out.print("Enter number 1: ");
//        int a = check.nextInt();
//        System.out.print("Enter number 2: ");
//        int b = check.nextInt();
//
//        if (a==b){
//            System.out.println("Both are equal");
//        } else if (a>b) {
//            System.out.println("Number 1 is greater and number 2 is smaller");
//        }else {
//            System.out.println("Number 1 is smaller and number 2 is greater");
//        }

        // Second type of conditional is Switch case

        /*
        Here's a Syntax:
        switch(variable){
        case 1(variable type ke anusar): stt;
        break;---> this is necessary because if we didn't put break the code will execute rest all also.
        case 2: stt;
        break;
        case 3: stt;
        break;
        default: stt;
        }here's an example
         */

//        System.out.print("Enter a number 1(Hello), 2(Namaste), 3(Bonjour): ");
//        int button = check.nextInt();

        /*
        switch (button){
                case 1:
                System.out.println("Hello");
                break;
                case 2:
                System.out.println("Namaste");
                break;
                case 3:
                System.out.println("Bonjour");
                break;
                default:
                    System.out.println("Invalid number!");
        }
         */
    }
}
