import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Design the algorithm of a program which:
 * 1. Ask by keyboard for a number (integer data).
 * 2. Display the inverse of the number entered.
 * Example:
 * Number entered is 456, it should display 654.
 */

/**
 * Diseñar el algoritmo de un programa que:
 * 1. Pida por teclado un número (dato entero).
 * 2. Muestre el número inverso del introducido.
 * Ejemplo:
 * Número introducido es 456, debe mostrar 654.
 */

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, numberReversed = 0, remainder;

        try {
            System.out.println("Enter a number:");
            number = sc.nextInt();
            sc.close();
            while (number > 0) {
                remainder = number % 10;
                numberReversed = numberReversed * 10 + remainder;
                number /= 10;
            }
        } catch (InputMismatchException e) {
            System.out.println("You must enter a numeric value");
            main(args);
            System.exit(0);
        }
        System.out.println( "Inverted number: " + numberReversed );
    }
}
