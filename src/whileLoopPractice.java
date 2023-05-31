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

        System.out.print("Enter a number: ");
        int tableNum = sc.nextInt();
        int till = 1;

        while (till<=20)
        {
            int result;
            result = tableNum*till;
            System.out.println(tableNum + " * " + till + " = " + result);
            till++;
        }

    }
}
