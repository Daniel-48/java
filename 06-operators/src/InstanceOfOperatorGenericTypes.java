public class InstanceOfOperatorGenericTypes {
    public static void main(String[] args) {
        Object name = "Gael", surnames = "Pompa Ciambrino";
        Number number = 47;
        Number decimalNumber = 98.7;
        Boolean isFalse = false;
        System.out.println(name + " " + surnames);
        boolean b = name instanceof String;
        System.out.println("Is the variable name of type String? " + b);
        b = name instanceof Integer;
        System.out.println("Is the variable name of type Integer? " + b);
        b = surnames instanceof Object;
        System.out.println("Is the variable surnames of type Object? " + b);
        b = surnames instanceof Integer;
        System.out.println("Is the variable surnames of type Integer? " + b);
        b = number instanceof Integer;
        System.out.println("Is the variable number of type Integer? " + b);
        b = number instanceof Number;
        System.out.println("Is the variable number of type Number? " + b);
        b = number instanceof Object;
        System.out.println("Is the variable number of type Object? " + b);
        b = number instanceof Long;
        System.out.println("Is the variable number of type Long? " + b);
        b = number instanceof Double;
        System.out.println("Is the variable number of type Double? " + b);
        b = decimalNumber instanceof Double;
        System.out.println("Is the variable decimalNumber of type Double? " + b);
        b = decimalNumber instanceof Number;
        System.out.println("Is the variable decimalNumber of type Number? " + b);
        b = decimalNumber instanceof Integer;
        System.out.println("Is the variable decimalNumber of type Integer? " + b);
        b = decimalNumber instanceof Float;
        System.out.println("Is the variable decimalNumber of type Float? " + b);
        b = isFalse instanceof Boolean;
        System.out.println("Is the variable isFalse of type Boolean? " + b);
    }
}
