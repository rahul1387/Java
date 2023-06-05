import java.util.Scanner;

public class arrays
{
    public static void main(String[] args)
    {
//        int [] marks = new int [3];
//        marks [0] = 96;
//        marks [1] = 99;
//        marks [2] = 92;

        //There is one more way to write array
//        int [] marks = {96,99,92};

        //Taking input of array from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of list: ");
        int size = sc.nextInt();
        int[] numbers = new int [size];

        //Input
        for (int i = 0; i<size; i++)
        {
            System.out.print("Enter array values: ");
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter a value which index you want: ");
        int x = sc.nextInt();

        //Output
        for (int k = 0; k<numbers.length; k++)
        {
            if (numbers[k] == x){
                System.out.println(x + " is found at index: " + k);
            }
        }
    }
}
