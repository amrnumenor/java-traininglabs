package global.skymind.solution.fundamental;

// data operations
public class M3_DataOps {

    static void ArithmeticOps(double var1, double var2) {

        /*
        In Java, the simplest and most common arithmetic operators are "+", "-", "*",
        "/" and "%".
        */
        System.out.println("\n******************** Arithmetic Operations ********************");
        System.out.println("var1 = " + var1 + ", var2 = " + var2);
        double var3 = 0;

        //demonstrating "+" aka addition
        var3 = var1 + var2;
        System.out.println(var1 + " + " + var2 + " = " + var3);

        //demonstrating "-" aka subtraction
        var3 = var1 - var2;
        System.out.println(var1 + " - " + var2 + " = " + var3);

        //demonstrating "*" aka multiplication or product
        var3 = var1 * var2;
        System.out.println(var1 + " * " + var2 + " = " + var3);

        //demonstrating "/" aka division
        var3 = var1 / var2;
        System.out.println(var1 + " / " + var2 + " = " + var3);

        //demonstrating "%" aka modulus or remainder
        var3 = var1 % var2;
        System.out.println(var1 + " % " + var2 + " = " + var3);

    }

    static void AssignmentOps(double var1, double var2, double var3) {

        /*
        In Java, the simplest and most common assignment operators are the equal sign "=".
        Here, we demonstrate more advanced assignment operators like "+=", "-=", "*=",
        "/=" and "%=" by combining "=" with arithmetic operators.
        */

        if (var2 != var3) {
            System.out.println("Note: var2 and var3 must be same. Execution halted.");
        } else {
            System.out.println("\n******************** Assignment Operations ********************");
            System.out.println("var1 = " + var1 + ", var2 = " + var2 + ", var3 = " + var3);
            double var4 = var2;
            double var5 = var3;

            //demonstrating "+=", which means assigning sum of var1 and var2 into var2
            var2 = var2 + var1;
            //above expression is similar to the following shorthand
            var3 += var1;
            System.out.println("var2 = " + var2 + ", var3 = " + var3);

            var2 = var4;
            var3 = var5;
            //demonstrating "-="
            var2 = var2 - var1;
            //above expression is similar to the following shorthand
            var3 -= var1;
            System.out.println("var2 = " + var2 + ", var3 = " + var3);

            var2 = var4;
            var3 = var5;
            //demonstrating "*="
            var2 = var2 * var1;
            //similar to the following shorthand
            var3 *= var1;
            System.out.println("var2 = " + var2 + ", var3 = " + var3);

            var2 = var4;
            var3 = var5;
            //demonstrating "*="
            var2 = var2 * var1;
            //above expression is similar to the following shorthand
            var3 *= var1;
            System.out.println("var2 = " + var2 + ", var3 = " + var3);

            var2 = var4;
            var3 = var5;
            //demonstrating "/="
            var2 = var2 / var1;
            //above expression is similar to the following shorthand
            var3 /= var1;
            System.out.println("var2 = " + var2 + ", var3 = " + var3);

            var2 = var4;
            var3 = var5;
            //demonstrating "%="
            var2 = var2 % var1;
            //above expression is similar to the following shorthand
            var3 %= var1;
            System.out.println("var2 = " + var2 + ", var3 = " + var3);
        }

    }

    static void RelationalOps(double var1, double var2) {

        /*
        In Java, the relationship between two operands can be checked using relational
        operators. Here, we demonstrate relational operators like "==", "!=", "<",
        ">", ">=" and "<=".
        */
        System.out.println("\n******************** Relational Operations ********************");
        System.out.println("var1 = " + var1 + ", var2 = " + var2);

        // demonstrating "==" aka equal
        System.out.println("var1 == var2 is " + (var1 == var2));

        // demonstrating "!=" aka not equal
        System.out.println("var1 != var2 is " + (var1 != var2));

        // demonstrating "<" aka less than
        System.out.println("var1 < var2 is " + (var1 < var2));

        // demonstrating ">" aka greater than
        System.out.println("var1 > var2 is " + (var1 > var2));

        // demonstrating "<=" aka less than or equal to
        System.out.println("var1 <= var2 is " + (var1 <= var2));

        // demonstrating ">=" aka greater than or equal to
        System.out.println("var1 >= var2 is " + (var1 >= var2));

    }

    static void LogicalOps(double var1, double var2, double var3, double var4) {

        /*
        In Java, logical operators can be used in decision making - to check expressions.
        Here, we demonstrate logical operators like "&&", "||" and "!".
        */
        System.out.println("\n******************** Logical Operations ********************");
        System.out.println("var1 = " + var1 + ", var2 = " + var2 + ", var3 = " + var3 + ", var4 = " + var4);

        // demonstrating "&&" aka Logical AND
        System.out.println("(var1 == var2) && (var3 == var4) is " + ((var1 == var2) && (var3 == var4)));

        // demonstrating "||" aka Logical OR
        System.out.println("(var1 == var2) || (var3 == var4) is " + ((var1 == var2) && (var3 == var4)));

        // demonstrating "!" aka Logical NOT
        System.out.println("!(var1 > var2) is " + !(var1 > var2));
        System.out.println("!(var1 < var2) is " + !(var1 < var2));

    }

    static void UnaryOps(double var1, boolean var2) {

        /*
        In Java, unary operators are used with one operand.
        Here, we demonstrate unary operators like "+", "-", "++", "--" and "!".
        */
        System.out.println("\n******************** Unary Operations ********************");
        System.out.println("var1 is " + var1 + ", var2 is " + var2);

        // "+" aka unary plus demonstration is skipped as numbers are positive by default
        System.out.println(" (+) aka unary plus demonstration is skipped as numbers are positive by default");

        // demonstrate "-" aka unary minus
        System.out.println("-var1 is" + -var1);

        // demonstrate "++" aka increment operator
        System.out.println("++var1 is " + ++var1);
        System.out.println("var1++ before increment is " + var1++);
        System.out.println("var1++ after increment is " + var1);

        // demonstrate "--" aka decrement operator
        System.out.println("--var1 is " + --var1);
        System.out.println("var1-- before decrement is " + var1--);
        System.out.println("var1-- after decrement is " + var1);

        // demonstrate "!" aka logical complement operator which inverts value of boolean
        System.out.println("!var2 is " + !var2);

    }

    static void TernaryOps(double speed) {

        /*
        In Java, ternary operator is the shorthand for if-then-else statement
        Syntax: variable = Expression ? expression1 : expression2

        E.g.
        If Expression is true, expression1 will be assigned to variable
        If Expression is false, expression2 will be assigned to variable
        */
        System.out.println("\n******************** Ternary Operations ********************");
        double speedLimit = 110; //in km/h

        String result = (speed > speedLimit) ? "Slow down!" : "You are within speed limit.";
        System.out.println(result);

    }

    public static void main(String[] args) {

        ArithmeticOps(1, 2);

        AssignmentOps(1, 2, 2);

        RelationalOps(1, 1);

        LogicalOps(1, 2, 3, 4);

        UnaryOps(1, true);

        TernaryOps(100);

    }
}
