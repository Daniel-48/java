import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Multiply two numbers without using the multiplication symbol.
 * Using the keyboard, ask for two positive or negative integers and multiply them, but without using the multiplication symbol (*).
 * You can use a for statement to perform the multiplication and take into account unary, where minus by minus is positive.
 */

/**
 * Multiplicar dos números sin usar el símbolo de multiplicación.
 * Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*).
 * Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, result = 0, absolute;

        try {
            System.out.println("Enter the first number:");
            a = sc.nextInt();
            System.out.println("Enter the second number:");
            b = sc.nextInt();
            sc.close();
            // Calculate the absolute value of a
            absolute = Math.abs(-a);
            // Add the number of times the value of b, according to the value of a
            for (int i = 0; i < absolute; i++) {
                result += b;
            }
            // If both are negative or if only a is negative, we turn the sign around
            if ((a < -1 && b < -1) || a < -1) {
                result = -result;
            }
        } catch (InputMismatchException e) {
            System.out.println("You must enter a numeric value");
            main(args);
            System.exit(0);
        }
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println(a + " * " + b + " = " + result);
    }
}
