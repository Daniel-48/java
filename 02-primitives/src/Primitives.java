public class Primitives {
    public static void main(String[] args) {
        // Integers
        byte byteNumber = 127;
        System.out.println("byte number = " + byteNumber);
        System.out.println("byte type in bytes " + Byte.BYTES);
        System.out.println("byte type in bits " + Byte.SIZE);
        System.out.println("maximum value of a byte " +  Byte.MAX_VALUE);
        System.out.println("minimum value of a byte " +  Byte.MIN_VALUE);
        System.out.println();

        short shortNumber = 32767;
        System.out.println("short number = " + shortNumber);
        System.out.println("short type in bytes " + Short.BYTES);
        System.out.println("short type in bits " + Short.SIZE);
        System.out.println("maximum value of a short " +  Short.MAX_VALUE);
        System.out.println("minimum value of a short " +  Short.MIN_VALUE);
        System.out.println();

        int intNumber = 2147483647;
        System.out.println("int number = " + intNumber);
        System.out.println("int type in bytes " + Integer.BYTES);
        System.out.println("int type in bits " + Integer.SIZE);
        System.out.println("maximum value of a int " +  Integer.MAX_VALUE);
        System.out.println("minimum value of a int " +  Integer.MIN_VALUE);
        System.out.println();

        long longNumber =  2147483648L;
        System.out.println("long number = " + longNumber);
        System.out.println("long type in bytes " + Long.BYTES);
        System.out.println("long type in bits " + Long.SIZE);
        System.out.println("maximum value of a long " +  Long.MAX_VALUE);
        System.out.println("minimum value of a long " +  Long.MIN_VALUE);
        System.out.println();

        var number = 40000;
        System.out.println("In Ibiza I will " + number + " euros per season");
        System.out.println();

        // Real or floating numbers
        float floatNumber = 3.4028235E38F;
        System.out.println("float number = " + floatNumber);
        System.out.println("float type in bytes " + Float.BYTES);
        System.out.println("float type in bits " + Float.SIZE);
        System.out.println("maximum value of a float " +  Float.MAX_VALUE);
        System.out.println("minimum value of a float " +  Float.MIN_VALUE);
        System.out.println();

        double  doubleNumber = 1.7976931348623157E308;
        System.out.println("double number = " + doubleNumber);
        System.out.println("double type in bytes " + Double.BYTES);
        System.out.println("double type in bits " + Double.SIZE);
        System.out.println("maximum value of a double " +  Double.MAX_VALUE);
        System.out.println("minimum value of a double " +  Double.MIN_VALUE);
        System.out.println();

        // Characters
        char character = 'A';
        var letter = '\u0041';
        char decimal = 65;
        char symbol = '@';
        System.out.println("character = " + character);
        System.out.println("letter = " + letter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = character: " + (decimal == character));
        System.out.println("symbol = " + symbol);
        System.out.println("char type in bytes " + Character.BYTES);
        System.out.println("char type in bits " + Character.SIZE);
        System.out.println();

        //Booleans
        boolean logicalData = true;
        System.out.println("logical data = " + logicalData);
        int a = 7;
        int b = 40;
        logicalData = a > b;
        System.out.println("logical data = " + logicalData);
    }
}
