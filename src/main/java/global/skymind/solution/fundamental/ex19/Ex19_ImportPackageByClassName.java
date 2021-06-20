package global.skymind.solution.fundamental.ex19;

/*
    1. We can access a specific class package but not the sub-packages by using a
       specific class name after the import statement.
    2. In contrast to the Fully Qualified Name method, the instance of class
       MyClass is created in simplified term and not need to include whole package name.
 */

//Import here
import global.skymind.util.*;

public class Ex19_ImportPackageByClassName {

    public static void main(String args[])
    {
        /*
            Ex3. Import Entire Package Method
            a. Please create obj instance and import MyClass to print
            b. The MyClass file is located at global.skymind.util
         */

        // Initializing the String variable with a value
        String name = "The entire packages is imported by using asterisk *";

        // Creating an instance of class MyClass from another package.
        //Write your code here
        MyClass obj = new MyClass();
        obj.printName(name);
    }
}


