public class operators {
    public static void main(String[] args) {
        /*
        In java, operators are symbol that are used to perform specific operations on operands, which can be variables, constants, or expression.There are several types of operators in Java including:
                        1.Arithmetic operators:
                                                Arithmetic operators are used to basic operations such as addition, subtraction, multiplication, division.Here are some examples
         */
        int num1 = 10;
        int num2 = 20;

        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;

        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + diff);
        System.out.println("The product is: " + product);
        System.out.println("The quotient is: " + quotient);

        /*
        2. Comparison operators: This operator is used to compare to values which are assigned and returns the boolean value of either true or false.Here are some examples:
         */
        int a = 10;
        int b = 20;
        System.out.println(a==b);//---> Equality operator
        System.out.println(a!=b);//---> Inequality operator
        System.out.println(a>b);//---> Greater than operator
        System.out.println(a<b);//---> Lesser than operator
        System.out.println(a>=b);//---> Greater than or equal to operator
        System.out.println(a<=b);//---> Lesser than or equal to operator

        /*
        3. Logical operator:Logical operators are used to perform logical operations on boolean values. Here are some examples:
         */
        boolean x = true;
        boolean y = false;

        System.out.println(x&&y);//---> Logical AND operator
        System.out.println(x||y);//---> Logical OR operator
        System.out.println(!y);//---> Logical NOT operator

        /*
        4. Assignment Operator:Assignment operators are used to assign values to variables.
           Here are some examples:
         */
        int c = 10;
        c += 5; // Compound assignment operator (equivalent to c = c + 5)
        c -= 2; // Compound assignment operator (equivalent to c = c - 2)
        c *= 3; // Compound assignment operator (equivalent to c = c * 3)
        c /= 4; // Compound assignment operator (equivalent to c = c / 4)
        System.out.println(c);

        /*
        Increment and Decrement Operators: The increment (++) and decrement (--) operators are used to increase or decrease the value of a variable by one. They can be used in both prefix and postfix forms.
         */
        int count = 5;
        count++; // Increment operator (postfix)
        ++count; // Increment operator (prefix)
        count--; // Decrement operator (postfix)
        --count; // Decrement operator (prefix)
    }
}
