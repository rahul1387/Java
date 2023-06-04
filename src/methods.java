public class methods
{
    public static void Sum(int a, int b)
    {

        int sum = a+b;
        System.out.println("The sum is: " + sum);
    }
    public static void Product(int a, int b)
    {

        int product = a*b;
        System.out.println("The product is: " + product);
    }
    public static void Difference(int a, int b)
    {

        int difference = a/b;
        System.out.println("The difference is: " + difference);
    }
    public static void Divide(int a, int b)
    {

        int divide = a/b;
        System.out.println("The divide is: " + divide);
    }

    public static void main(String[] args)
    {
        Sum(2,3);
        Difference(20,10);
        Product(2,1);
        Divide(15,3);
    }
}

