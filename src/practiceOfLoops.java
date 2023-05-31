import java.util.*;

public class practiceOfLoops {
    public static void main(String[] args) {
        //Question 1:- Sum of Natural Numbers: Write a program to calculate the sum of the first N natural numbers.

        Scanner check = new Scanner(System.in);

//        System.out.print("Enter a number: ");
//        int n = check.nextInt();
//
//        int sum = 0;
//        for (int i =1; i<=n; i++){
//            sum = sum+i;
//        }
//        System.out.print("The sum this number is: ");
//        System.out.println(sum);

        //Question2:- Factorial: Write a program to calculate the factorial of a given number.

//        System.out.print("Enter a number to calculate factorial: ");
//        int no = check.nextInt();
//
//        int multi = 1;
//        for (int i = 1; i<=no; i++){
//            multi = multi*i;
//        }
//        System.out.print("The Factorial of " + no + " is: ");
//        System.out.println(multi);

        //Question3:- Fibonacci Series: Write a program to generate the Fibonacci series up to a given limit.

//        int a = 0;
//        int b = 1;
//        int c;
//        System.out.print("Enter a range: ");
//        int d = check.nextInt();
//        System.out.println(a + " " + b);
//
//        for (int i = 1; i<=d; i++){
//            c = a+b;
//            System.out.println(" " + c);
//            a=b;
//            b=c;
//        }

        //Question4:- Prime Numbers: Write a program to check whether a given number is prime or not.
//                System.out.print("Enter a number: ");
//                int number = check.nextInt();
//
//                boolean isPrime = true;
//
//                if (number <= 1)
//                {
//                    isPrime = false;
//                } else
//                {
//                    for (int i = 2; i <= Math.sqrt(number); i++)
//                    {
//                        if (number % i == 0)
//                        {
//                            isPrime = false;
//                            break;
//                        }
//                    }
//                }
//                if (isPrime)
//                {
//                    System.out.println(number + " is a prime number .");
//                }else
//                {
//                    System.out.println(number + " is not a prime number.");
//                }

        //Question5:- Reverse a Number: Write a program to reverse a given number.

//        System.out.print("Enter a number: ");
//        int num = check.nextInt();
//        int rev = 0,rem;
//
//        while(num != 0)
//        {
//            //this is a formula to revers a number
//            rem = num % 10;
//            rev = rev * 10 + rem;
//            num = num / 10;
//        }
//        System.out.print("The Revers of this number is: " + rev);

        //Question6:-  Multiplication Table: Write a program to generate the multiplication table for a given number.

//        System.out.println("Enter a number: ");
//        int tableNumber = check.nextInt();
//        for (int i = 1; i<=10; i++)
//        {
//            System.out.println(tableNumber + " * " + i + " = " + tableNumber*i);
//            System.out.println();
//        }

        //Question7:- Power of a Number: Write a program to calculate the power of a number using a given exponent.

//        int number;
//        int power;
//
//        System.out.print("Enter number: ");
//        number = check.nextInt();
//        System.out.print("Enter power: ");
//        power = check.nextInt();
//
//        int result = 1;
//
//        for (int i = 1; i<=power; i++)
//        {
//            result = number*result;
//        }
//        System.out.println("The power of " + number + " to " + power + " is: " +                          result);

        //Question8:- Palindrome Number: Write a program to check whether a given number is a palindrome or not.

//        System.out.print("Enter a number: ");
//        int num = check.nextInt();
//        int safe = num;
//        int rev = 0,rem;
//
//        while(safe!=0)
//        {
//            rem = safe % 10;
//            rev = rev * 10 + rem;
//            safe = safe / 10;
//        }
//
//        if (num==rev)
//        {
//            System.out.println(num + " is a palindrome number");
//        }else
//        {
//            System.out.println(num + " is not a palindrome number");
//        }

        //Question9:- Armstrong Number: Write a program to check whether a given number is an Armstrong number or not.

//        System.out.print("Enter a Number: ");
//        int number = check.nextInt();
//        int t1 = number;
//        int lenght = 0;
//
//        while (t1 != 0)
//        {
//            lenght = lenght+1;
//            t1 = t1/10;
//        }
//
//        //second logic
//        int t2 = number;
//        int remainder;
//        int armstrong = 0;
//
//        while (t2 != 0)
//        {
//            remainder =t2 % 10;
//            int mul = 1;
//            for (int i = 1; i<=lenght; i++)
//            {
//                mul = mul * remainder;
//            }
//            armstrong = armstrong + mul;
//            t2 = t2/10;
//        }
//        if (number==armstrong)
//        {
//            System.out.println(number + " is armstrong number");
//        }else
//        {
//            System.out.println(number + " is not a armstrong number");
//        }

        //Question10:- GCD and LCM: Write a program to calculate the greatest common divisor (GCD) and least common multiple (LCM) of two numbers.

        //Question11:- Count Digits: Write a program to count the number of digits in a given number.

//        System.out.print("Enter a Number: ");
//        long no = check.nextLong();
//        long t3 = no;
//        int count = 0;
//
//        while (t3 != 0)
//        {
//            count = count+1;
//            t3 = t3/10;
//        }
//        System.out.println("The total digit in the " + no + " is " + count);

        //Question12:- Factorial of Large Numbers: Write a program to calculate the factorial of large numbers that cannot be stored in primitive data types.

        //Question13:- Print Pattern: Write a program to print a pattern using loops, such as a pyramid or a diamond shape.

//        for (int i = 1;i<=4; i++)
//        {
//            for (int j = 4;j>=i; j--)
//            {
//                System.out.print(" ");
//            }
//            for (int k = 1; k<=i; k++)
//            {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }

        //Question14:- Find the Largest Element: Write a program to find the largest element in an array.

//        int [] a = {1,2,3,56,4,88,152,258,369};
//        int max = a[0];
//        for (int i = 1; i<a.length; i++)
//        {
//            if (a[i]>max)
//            {
//                max = a[i];
//            }
//        }
//        System.out.print("The maximum in the list is: " + max);

        //Question15:- Calculate Average: Write a program to calculate the average of a list of numbers.

//        System.out.print("Enter marks of Subject 1: ");
//        int sub1=check.nextInt();
//        System.out.print("Enter marks of Subject 2: ");
//        int sub2 = check.nextInt();
//        System.out.print("Enter marks of Subject 3: ");
//        int sub3 = check.nextInt();
//        System.out.print("Enter marks of Subject 4: ");
//        int sub4 = check.nextInt();
//        System.out.print("Enter marks of Subject 5: ");
//        int sub5 = check.nextInt();
//
//        int sum = sub1+sub2+sub3+sub4+sub5;
//        double avg = sum/5.0;
//        System.out.println("The total marks are: " + sum);
//        System.out.print("The average marks are: " + avg);


    }
}