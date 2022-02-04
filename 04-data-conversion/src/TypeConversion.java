public class TypeConversion {
    public static void main(String[] args) {
        // Conversion of strings to primitives
        String numberString = "47";
        int integerNumber = Integer.parseInt(numberString);
        System.out.println("integer = " + integerNumber);

        String realNumberString = "98.63";
        double realDouble = Double.parseDouble(realNumberString);
        System.out.println("real double = " + realDouble);

        float realFloat = Float.parseFloat(realNumberString);
        System.out.println("real float = " + realFloat);

        String boleanString = "true";
        boolean logicalData = Boolean.parseBoolean(boleanString);
        System.out.println("logical data = " + logicalData);

        // Conversion from primitive type to string
        int i = 100;
        System.out.println("integer = " + i);
        String strInteger = Integer.toString(i);
        System.out.println("string of an integer = " + strInteger);
        strInteger = String.valueOf(i+10);
        System.out.println("string of an integer = " + strInteger);

        double d = 47.73;
        String strDouble = Double.toString(d);
        System.out.println("string of a double = " + strDouble);
        strDouble = String.valueOf(d+50);
        System.out.println("string of a double = " + strDouble);

        float f = 48.4F;
        String strFloat = Float.toString(f);
        System.out.println("string of a float = " + strFloat);
        strFloat = String.valueOf(f+6);
        System.out.println("string of a float = " + strFloat);

        boolean b = true;
        String strBoolean = Boolean.toString(b);
        System.out.println("string of a boolean = " + strBoolean);
        strBoolean = String.valueOf(b);
        System.out.println("string of a boolean = " + strBoolean);

        // Conversion between primitive types
        int x = 99;
        byte byteNumber = (byte) x;
        System.out.println("conversion of an integer to a byte = " + byteNumber);
        short shortNumber = (short) x;
        System.out.println("conversion of an integer to a short = " + shortNumber);
        double doubleNumber = x;
        System.out.println("conversion of an integer to a double = " + doubleNumber);
        float floatNumber = (float) x;
        System.out.println("conversion of an integer to a float = " + floatNumber);
        long longNumber = x;
        System.out.println("conversion of an integer to a long = " + longNumber);
        char c = (char) x;
        System.out.println("conversion of an integer to a char = " + c);
    }
}
