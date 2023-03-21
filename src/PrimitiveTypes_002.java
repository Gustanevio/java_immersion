
public class PrimitiveTypes_002 {

    public static void main(String args[]) {
        //HELLO WORD
        System.out.println("Hello Word");

        /*
            PREMITIVE DATA TYPES
         */
        System.out.println("----------------------------------");
        //Byte
        byte byteNumber = 120;
        System.out.println("Min byte value: " + Byte.MIN_VALUE);
        System.out.println("Max byte value: " + Byte.MAX_VALUE);
        System.out.println("Byte number: " + byteNumber);
        System.out.println("----------------------------------");

        //Byte
        short shortNumber = 200;
        System.out.println("Min short value: " + Short.MIN_VALUE);
        System.out.println("Max short value: " + Short.MAX_VALUE);
        System.out.println("Short number: " + shortNumber);
        System.out.println("----------------------------------");

        //Int
        int intNumber = 500;
        System.out.println("Min int value: " + Integer.MIN_VALUE);
        System.out.println("Max int value: " + Integer.MAX_VALUE);
        System.out.println("Integer number: " + intNumber);
        System.out.println("----------------------------------");

        //Long
        long longNumber = 120;
        System.out.println("Min long value: " + Long.MIN_VALUE);
        System.out.println("Max long value: " + Long.MAX_VALUE);
        System.out.println("Long number: " + longNumber);
        System.out.println("----------------------------------");

        //Float
        float floatNumber = (float) 10.0;
        System.out.println("Min float value: " + Float.MIN_VALUE);
        System.out.println("Max float value: " + Float.MAX_VALUE);
        System.out.println(floatNumber);
        System.out.println("----------------------------------");

        //Double
        double doubleNumber = 10.0;
        System.out.println("Min double value: " + Double.MIN_VALUE);
        System.out.println("Max double value: " + Double.MAX_VALUE);
        System.out.println(doubleNumber);
        System.out.println("----------------------------------");

        //Var
        var varVariableInteger = 10;
        var varVariableString = "text var string";
        System.out.println("Var type: " + varVariableInteger);
        System.out.println("Var type: " + varVariableString);
        System.out.println("----------------------------------");

        //Char
        char charVarable = 'A';
        char charVarable_2 = '\u0021';
        System.out.println("Char type 1: " + charVarable);
        System.out.println("Char type 2: " + charVarable_2);
        System.out.println("----------------------------------");
        
        //Boolean
        boolean varVariableBoolean = true;
        System.out.println("Boolean type: " + varVariableBoolean);
        System.out.println("----------------------------------");
        
        //CONVERT STRING TO INT
        var stringToInteger = Integer.parseInt("20");
        System.out.println("convert string to int = " + stringToInteger);
        
        
    }

}
