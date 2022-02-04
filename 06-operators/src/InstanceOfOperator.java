public class InstanceOfOperator {
    public static void main(String[] args) {
        String name = "Gael", surnames = "Pompa Ciambrino";
        Integer number = 47;
        Double decimalNumber = 98.7;
        Boolean isFalse = false;
        boolean b1 = name instanceof String;
        boolean b2 = surnames instanceof Object;
        boolean b3 = number instanceof Integer;
        boolean b4 = number instanceof Number;
        boolean b5 = number instanceof Object;
        boolean b6 = decimalNumber instanceof Double;
        boolean b7 = decimalNumber instanceof Number;
        boolean b8 = isFalse instanceof Boolean;
        System.out.println(name.concat(" ").concat(surnames));
        System.out.println("Is the variable name of type String? " + b1);
        System.out.println("Is the variable surnames of type Object? " + b2);
        System.out.println("Is the variable number of type Integer? " + b3);
        System.out.println("Is the variable number of type Number? " + b4);
        System.out.println("Is the variable number of type Object? " + b5);
        System.out.println("Is the variable decimalNumber of type Double? " + b6);
        System.out.println("Is the variable decimalNumber of type Number? " + b7);
        System.out.println("Is the variable isTrue of type Boolean? " + b8);
    }
}
