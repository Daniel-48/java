public class ClassIntegerWrapper {
    public static void main(String[] args) {
        int primitive = 47558;
        Integer object1 = 973947;
        Integer object2 = Integer.valueOf(32767);
        System.out.println("object1 = " + object1);
        System.out.println("object2 = " + object2);

        // Convert a primitive to an object
        Integer object3 = primitive;
        Integer object4 = Integer.valueOf(primitive);
        System.out.println("object3 = " + object3);
        System.out.println("object4 = " + object4);

        // Convert integer object to a primitive type
        int number1 = object1;
        int number2 = object1.intValue();
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);

        // Convert a string to an integer value
        String salary = "7000";
        Integer integerValue = Integer.valueOf(salary);
        System.out.println("integer value = " + integerValue);

        // Convert integer to a short
        Short shortObject = object2.shortValue();
        System.out.println("short object = " + shortObject);

        // Convert integer to byte
        Integer object5 = 127;
        Byte byteObject = object5.byteValue();
        System.out.println("byte object = " + byteObject);
        
        // Convert integer to a long
        Integer object6 = Integer.MAX_VALUE;
        Long longObject = object6.longValue();
        System.out.println("long object = " + longObject);
    }
}
