import java.util.InputMismatchException;
import java.util.Scanner;

public class NumericalSystemsInputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        int decimal = 0;
        try {
            decimal = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You must enter a whole number");
            main(args);
            System.exit(0);
        };
        System.out.println("decimal = " + decimal);

        String binary = "binary number of " + decimal + " = " + Integer.toBinaryString(decimal);
        String octal = "octal number of " + decimal + " = " +  Integer.toOctalString(decimal);
        String hexadecimal = "hexadecimal number of " + decimal + " = " +  Integer.toHexString(decimal);

        String message = binary;
        message += "\n" + octal;
        message += "\n" + hexadecimal;
        System.out.println(message);
    }
}
