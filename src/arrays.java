import java.util.*;

public class arrays
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        int [] marks = new int [3];
//        marks [0] = 96;
//        marks [1] = 99;
//        marks [2] = 92;

        //There is one more way to write array
//        int [] marks = {96,99,92};

        //Taking input of array from user

//        System.out.print("Enter a size of list: ");
//        int size = sc.nextInt();
//        int[] numbers = new int [size];
//
       //Input
//        for (int i = 0; i<size; i++)
//        {
//            System.out.print("Enter array values: ");
//            numbers[i] = sc.nextInt();
//        }
//
//        System.out.print("Enter a value which index you want: ");
////        int x = sc.nextInt();
//
        //Output
//        for (int k = 0; k<numbers.length; k++)
//        {
//            if (numbers[k] == x)
//            {
//                System.out.println(x + " is found at index: " + k);
//            }
//        }
        //TwoDArrays
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        int[][] num = new int [rows][columns];

        //input
        //rows
        for (int i = 0; i<rows; i++)
        {
            //columns
            for (int j = 0; j<columns; j++)
            {
                num[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter a value which index you want: ");
        int checkLocation = sc.nextInt();
        //output
        for (int i = 0; i<rows; i++)
        {
            //columns
            for (int j = 0; j<columns; j++)
            {
                if (num[i][j] == checkLocation)
                {
                    System.out.println( checkLocation + " is on location (rows,columns): (" + i + ", " + j + ")");
                }
            }

        }
    }
}
