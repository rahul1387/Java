import java.util.*;

public class loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        // If we have to execute the code multiple times then we use loops in Java.

        //There are three types of loops:- For loop, While loop, Do-While loop.
        /*
        Here is a Syntax of For loop

        for(initialization; condition; updation){
        stt;
        }
        Here's a example:
         */
//        for (int i = 0; i<=100; i++){
//            System.out.println("Hello World");
//        }
//        here's an another example

//        for (int num = 1; num <= 10; num++){
//            System.out.println(num);
//        }

        // While loop
        //Here's a Syntax of While loop
        /*
        initialization;
        while(condition){
        stt;
        update;
        }
        In while loop first the condition is checked and then the code will execute, If the condition is false then the code will not execute.

         */

//        int number = 1;
//        while (number<=100){
//            System.out.println(number);
//            number++;
//        }

        //Do-While loop
        //Here's a Syntax of this
        /*
        do{
        //stt; ---> this will execute either the condition is true or false
        Increment or Decrement;
        }while (condition);
         */

//         int j = 1;
//         do {
//             System.out.println(j);
//             j++;
//         }while (j<=10);

         //here's an example of comparison of while loop and do-while loop

//        int a = 15;
//        while(a<10){
//            System.out.println("yo yo haagney singh");
//        }
//        //do-while
//        do {
//            System.out.println("yo yo haagney singh");
//
//        }while (a<15);

        //Here are some questions:-

        //Question1

//        System.out.println("This will print sum of n natural number");
//        System.out.print("Enter a number:");
//        int n = sc.nextInt();
//
//        int sum = 0;
//        for (int b = 1; b<=n; b++){
//            sum +=b;
//        }
//        System.out.print("The sum of these numbers is: ");
//        System.out.println(sum);
//        System.out.println("Enter a number: ");
//        int tableNumber = sc.nextInt();
//        for (int i = 1; i<=10; i++)
//        {
////            System.out.println(tableNumber + " * " + i + " = " + tableNumber*i);
////            System.out.print();
////            System.out.print(tableNumber*i);
//        }

        //Examples of nested for loops
//        for (int m = 0; m<3; m++)
//        {
//            for (int n = 0; n<3; n++)
//            {
//                System.out.println(m + " " + n);
//            }
//            System.out.println();
//        }

        System.out.println("All two digit number");
        for (int s = 1; s<=9; s++ )
        {
            for (int d = 0; d<=9; d++)
            {
                System.out.println(s + "" + d);
            }
        }

    }
}
