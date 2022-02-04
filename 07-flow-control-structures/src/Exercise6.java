import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Design the algorithm of a program that:
 * 1. Requests by keyboard a number (integer data).
 * 2. Display the messages on the screen:
 * You have entered <amount-of-numbers> number(s).
 * The sum is <sum>.
 * 3. Ask the user if he/she wants to enter another one or not.
 * 4. Repeat steps 1, 2 and 3, as long as the user does not answer 'N' of (no).
 * 5. Display on screen the arithmetic mean (real data) of the numbers
 */

/**
 * Diseñar el algoritmo de un programa que:
 * 1. Pida por teclado un número (dato entero).
 * 2. Muestre por pantalla los mensajes:
 * Ha introducido <cantidad-de-números> número(s)
 * La suma es <suma>
 * 3. Pregunte al usuario si desea introducir otro o no.
 * 4. Repita los pasos 1º, 2º y 3º, mientras que, el usuario no responda 'n' de (no).
 * 5. Muestre por pantalla la media aritmética (dato real) de los números
 */

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = null;
        double average = 0;
        int number, total = 0, counter = 0;
        DecimalFormat df = new DecimalFormat("#.00");

        try {
            do {
                System.out.println("Enter a number:");
                number = sc.nextInt();
                sc.nextLine(); // Clear the buffer
                total += number;
                counter++;
                System.out.println("You have entered " + counter + " number(s)");
                System.out.println("The sum is: " + total);
                System.out.println("Do you want to enter another number? (Y/N):");
                next = sc.nextLine();
                do {
                    if (!next.equalsIgnoreCase("Y") && !next.equalsIgnoreCase("N")) {
                        System.out.println("You must enter Y or N");
                        next = sc.nextLine();
                    }
                } while (!next.equalsIgnoreCase("Y") && !next.equalsIgnoreCase("N"));
            } while (next.equalsIgnoreCase("Y"));
        } catch (InputMismatchException e) {
            System.out.println("You must enter a numeric value");
            main(args);
            System.exit(0);
        }
        average = (double) total / counter;
        System.out.println("The average of the numbers entered is: " + df.format(average));
        sc.close();
    }
}
