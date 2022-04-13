package pilatov;

public class JavaBasic {
    public static void main(String[] args) {

        char c = 'W';

        boolean boolTrue = true;
        boolean boolFalse = false;

        byte aByte = 2;             // -128 ... 127                                                 1 byte
        short aShort = 10000;       // -32768 ... 32767                                             2 byte
        int aInt = 10;              // -2 147 483 648 ... 2 147 483 647                             4 byte
        long aLong = 20L;   // –9 223 372 036 854 775 808 ... 9 223 372 036 854 775 807     8 byte
        float aFloat= 0.16F;       // 4 byte
        double aDouble= 16.16;      // 8 byte

        String hello = "Hello";
        String comma = ", ";
        String world = "World!";

        String [] arrayString = new String[3];
        arrayString[0] = hello;
        arrayString[1] = comma;
        arrayString[2] = world;

        //arithmetic
        System.out.println("Arithmetic:");
        System.out.println("int = "+ aInt);
        System.out.println("long = "+ aLong);
        System.out.println("int + long = " + (aInt + aLong));
        System.out.println("int - long = " + (aInt - aLong));
        System.out.println("int * long = " + (aInt * aLong));
        System.out.println("long / int = " + (aLong / aInt));
        System.out.println("long % byte = " + (aLong % aByte));
        System.out.println("long - short = " + (aLong - aShort));
        System.out.println("int++   = " + (aInt++));
        aInt = 10;
        System.out.println("int+=2   = " + (aInt+=2));
        aInt = 10;
        System.out.println("int--   = " + (aInt--));
        aInt = 10;
        System.out.println("--int   = " + (--aInt));
        aInt = 10;
        System.out.println("++int   = " + (++aInt));
        System.out.println("double - float = " + (aDouble - aFloat));
        System.out.println();

        //logical
        System.out.println("Logical:");
        System.out.println(boolTrue + " && " + boolFalse + " = " + (boolTrue && boolFalse));
        System.out.println(boolTrue + " || " + boolFalse + " = " + (boolTrue || boolFalse));
        System.out.println("!(" + boolTrue + " && " + boolFalse + ") = " + !(boolTrue && boolFalse));
        System.out.println();

        //array
        System.out.println("Array:");
        for (String s : arrayString) {
            System.out.print(s);
        }
        System.out.println();
        System.out.println();

        //string
        System.out.println("String:");
        System.out.println(hello + comma + world);


    }
}
