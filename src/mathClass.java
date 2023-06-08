public class mathClass
{
    public static void main(String[] args)
    {
        int num1 = 4;
        int num2 = 6;
        double math = Math.random();
        //int a = (int) 2.9; // this is known as casting
        System.out.println("Random number: " + (int ) (math * 10000) );
        System.out.println(Double.toString(math).length());
        //This will print the length of Math.random method using String method Double.toString().length() we can use any data type which can be converted into String.

    }
}