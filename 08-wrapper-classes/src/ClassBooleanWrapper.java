public class ClassBooleanWrapper {
    public static void main(String[] args) {
        Integer number1, number2;

        number1 = 1;
        number2 = Integer.valueOf(2);

        boolean booleanPrimitive1 = number1 > number2; // false
        Boolean booleanObject1 = Boolean.valueOf(booleanPrimitive1);
        Boolean booleanObject2 = Boolean.valueOf("false");
        Boolean booleanObject3 = true;

        System.out.println("boolean primitive = " + booleanPrimitive1);
        System.out.println("boolean object1 = " + booleanObject1);
        System.out.println("boolean object2 = " + booleanObject2);
        System.out.println("Compare two boolean objects: " + (booleanObject1 == booleanObject2));
        System.out.println("Compare two boolean objects: " + (booleanObject1.equals(booleanObject2)));
        System.out.println("Compare two boolean objects: " + (booleanObject2 == booleanObject3));

        // Convert to primitive type
        boolean booleanPrimitive2 = booleanObject2.booleanValue();
        System.out.println("boolean primitive2 = " + booleanPrimitive2);
    }
}
