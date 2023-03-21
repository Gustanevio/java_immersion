
public class Operators_003 {

    public static void main(String args[]) {
        /* ==========================================
                    ARITHIMETIC OPERATORS
        ============================================= */

        int a = 6, b = 2;

        //Sum
        var result = a + b;
        System.out.println("Sum of " + a + " + " + b + " = " + result);
        System.out.println("----------------------------------");

        //Subtraction
        result = a - b;
        System.out.println("Subtraction of " + a + " - " + b + " = " + result);
        System.out.println("----------------------------------");

        //Division
        result = a / b;
        System.out.println("Division of " + a + " / " + b + " = " + result);
        System.out.println("----------------------------------");

        //Multiplication
        result = a * b;
        System.out.println("Multiplication of " + a + " * " + b + " = " + result);
        System.out.println("----------------------------------");

        //Module
        result = a % 2;
        System.out.println("Modulo of " + a + " % " + b + " = " + result);
        System.out.println("----------------------------------");

        /* ==========================================
                   ASSIGMENT OPERATORS
        ============================================= */
        int d = 3, e = 2;
        int f = d + 5 - e;
        System.out.println("c = " + f);

        d += 1; // d = d + 1
        System.out.println("D = " + d);

        d -= 2; // d = d - 1
        System.out.println("D = " + d);
        System.out.println("----------------------------------");

        /* ==========================================
                   UNARY OPERATORS
        ============================================= */
        var g = 3;
        var h = -g;
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        //boolean
        boolean i = true;
        boolean j = !i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //increment
        var k = 3;
        var l = ++k;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("----------------------------------");

        /* ==========================================
                   RELATIONAL OPERATORS
        ============================================= */
        var m = 6;
        var n = 3;
        var q = (m >= n);
        System.out.println("q = " + q);
        System.out.println("----------------------------------");

        /* ==========================================
                   CONDITIONAL OPERATORS
        ============================================= */
        var v = 10;
        var minValue = 0;
        var maxValue = 10;

        var result_2 = v >= minValue && v <= maxValue;
        System.out.println("result_2 = " + result_2);
        System.out.println("----------------------------------");

        /* ==========================================
                   TERNARY OPERATORS
        ============================================= */
        int numberA = 19;
        int numberB = 3;

        var result_3 = (numberA > numberB) ? "this is true" : "this is false";
        System.out.println("result_3 = " + result_3);
    }

}
