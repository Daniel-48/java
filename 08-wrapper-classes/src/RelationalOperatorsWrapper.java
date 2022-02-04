public class RelationalOperatorsWrapper {
    public static void main(String[] args) {
        Integer number1 = 1000;
        Integer number2 = number1;

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
        System.out.println("Are they the same object? " + (number1 == number2));

        number2 = 1000;
        System.out.println("\nnumber1 = " + number1);
        System.out.println("number2 = " + number2);
        // Using the '==' operator compares whether they are the same object (reference)
        System.out.println("Are they the same object? " + (number1 == number2));
        //With the equals' method it compares by the value
        System.out.println("Are they the same value? " + (number1.equals(number2)));
        System.out.println("Are they the same value? " + (number1.intValue() == number2));
        boolean condition = number1 >= number2;
        System.out.println("condition = " + condition);

        // If the number is 127 or less it will always compare by value and not by instance
        Integer number3 = 127;
        Integer number4 = Integer.valueOf(127);
        System.out.println("\nnumber3 = " + number3);
        System.out.println("number4 = " + number4);
        System.out.println("Are they the same object? " + (number3 == number4));
        System.out.println("Are they the same value? " + (number3.equals(number4)));
        System.out.println("Are they the same value? " + (number3.intValue() == number4));
    }
}
