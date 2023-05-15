public class variablesInJava {
    public static void main(String[] args) {
        //VARIABLES---> A variable is a container that holds a value of particular data type. A variable has a name, a data type, and a value, and it can be assigned a new value at any time during the program's execution.
        /*
        Variables naming rules --->  1.The name should be in camelCasing.
                                     2.The starting should be with letters not numbers.
                                     3.The name can't be keywords.
         Here an example
         */
        int num = 16;
        /*
        In this example, "num" is the variable name, "int" is the data type (which stands for integer), and "16" is the initial value assigned to the variable. The data type determines what kind of value the variable can hold; in this case, the "int" data type can hold integer values.

        This will save the variable name in any memory card(Ram,HDD,SSD).there are many boxes in memory card in that the variable name & its value in each box.
         */
        //And when we print this, the command will go in memory card and it will search age in each boxes.For example the command will find the age in box no.1212(there are trillions of boxes) and it will find the in box 1214, so it will
//        System.out.println(age);

        //We can replace the value.
        age = 25;
        // The above value will replace the value which was their.We don't need define the name again because same name we have already defined, so we can directly call name and replace its value.If we call now again the age it will not print the first value, it will print the replaced value.
        System.out.println("The age is: " + age);
        
       //Here an example of string

        String name = "Rahul";
//        System.out.println(name);
        //We can replace this also
        name = "Neeraj";
        System.out.println(name);
    }
}
